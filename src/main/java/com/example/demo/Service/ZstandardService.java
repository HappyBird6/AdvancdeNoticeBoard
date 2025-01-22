package com.example.demo.Service;

import java.nio.charset.StandardCharsets;

import com.github.luben.zstd.Zstd;

public class ZstandardService {
    public static int Benchmarking(String originalData,int level){
        int originalSize; 
        int compressedSize; 
        double compressionRatio;
        double compressionTime; // compressing time 
        double compressionSpeed;
        double decompressionTime; // decompressing time
        double decompressionSpeed;
        // double usedCPU; // CPU 사용량
        // double usedMemory; // memory 사용량
        int integrity; // 무결성체크
        
        int NOC = originalData.length(); // 글자수
        byte[] data = originalData.getBytes(StandardCharsets.UTF_8);
        originalSize = data.length;

        long s = System.nanoTime();
        byte[] compressedData = compressData(data, level);
        long e = System.nanoTime();
        compressionTime = e - s;
        compressionSpeed = (double) data.length / compressionTime;
        compressionSpeed *= 1_000_000_000;

        compressedSize = compressedData.length;
        compressionRatio = getCompressionRatio(originalSize,compressedSize);

        s = System.nanoTime();
        String decompressedStringData = decompressData(compressedData, NOC);
        e = System.nanoTime();

        byte[] decompressedData = decompressedStringData.getBytes(StandardCharsets.UTF_8);
        decompressionTime = e - s;
        decompressionSpeed = (double) decompressedData.length / decompressionTime;
        decompressionSpeed *= 1_000_000_000;

        integrity = (originalData.equals(decompressedStringData)) ? 1 : 0;

        System.out.println("압축률 : "+compressionRatio+", 압축 속도 : "+compressionSpeed+ " bytes/sec"+", 해제 속도 : "+decompressionSpeed+ " bytes/sec, 무결성 : "+integrity);
        return 0;
    }
    private static byte[] compressData(byte[] originalData, int level){
        // level 1~22
        byte[] compressed = Zstd.compress(originalData, level);
        return compressed;
    }
    private static String decompressData(byte[] compressedData,int dataLength){
        byte[] decompressed = Zstd.decompress(compressedData, dataLength);
        String decompressedString = new String(decompressed, StandardCharsets.UTF_8);

        return decompressedString;
    }
    private static double getCompressionRatio(int a, int b){
        return ((double)b/a)*100;
    }
}
