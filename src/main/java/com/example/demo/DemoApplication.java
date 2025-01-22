package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.ZstandardService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String s = "Ex vix utroque copiosae delicata, vel in idque errem prompta, brute oratio est et. Nec id tritani tibique, in homero scribentur cum, illud postulant molestiae te vel. Hinc dicit te quo. Per idque graecis te, te usu essent salutatus.\r\n" + //
						"\r\n" + //
						"Integre eruditi torquatos no eos, ea sumo clita senserit pro, cu dolor vivendum eam. Pro feugait patrioque ex. Ex illud augue impedit mei, te mea diam vero invenire. Eros mnesarchum ea mea, cu mel nulla aeque dolores, vel fabulas denique erroribus ei. Vel eu pertinax repudiare.\r\n" + //
						"\r\n" + //
						"Ceteros deserunt no est, numquam sanctus fabulas eos et, per impedit definitionem no. Eu per utinam ignota everti. Nibh ipsum quaerendum mea in, doctus volumus ne qui, ne pro verear disputationi. Vel legere tritani vivendum te, per eius nonumes appetere te, erat persius volutpat ius no. His cibo pertinax qualisque ea, alia laoreet sed cu. Ei sonet tincidunt reprehendunt nec, eum an omnis nulla abhorreant. Est id sumo noster labores, augue inermis usu an.\r\n" + //
						"\r\n" + //
						"Mea vide consul id. Ex fabulas dolorem deserunt vix. Te everti suscipiantur his. Prima alienum consetetur cu nec. Mel cu graece fierent, no pro tota tibique assentior, ridens sadipscing accommodare pro ut.\r\n" + //
						"\r\n" + //
						"Nam ad regione quaeque legimus, his quaestio repudiandae et. Graeco omnium ne pro, audiam incorrupte sit ei, te semper adversarium sea. Zril virtute laoreet ut vis. Duo at postea debitis, cu quidam fabulas temporibus vel. Pri graece necessitatibus cu.\r\n" + //
						"\r\n" + //
						"Eu eum solet offendit periculis, sit sumo torquatos no. Assum interesset qui eu. An ignota laoreet imperdiet sed, mel ut delectus suavitate scripserit. Posse denique disputando ius id. An timeam accumsan sea, ex fabulas reprehendunt usu.\r\n" + //
						"\r\n" + //
						"Eu noluisse probatus eam, sit te habeo facete officiis, vix ut enim accumsan. Cu reque timeam assentior vim, altera quaeque euripidis mel ad. Tempor civibus evertitur pri ne, mea id veri liber similique. Ut mel affert commodo utroque, vel nobis blandit rationibus in.\r\n" + //
						"\r\n" + //
						"Erant paulo ei pri, cu adipisci tacimates vis, vel ea elit malis lobortis. Ut per noster vocibus copiosae. No scripta oporteat mea. Ea nec facete causae volutpat, mentitum tacimates sed ne. Eum saepe persequeris ei, mea brute electram ei. Eu doctus consulatu sed, amet ornatus argumentum eos an.\r\n" + //
						"\r\n" + //
						"Te tempor repudiare qui, usu te simul nostrud. Per ubique iriure ex, nullam antiopam vituperata ea has, ne ius munere salutandi accommodare. Cu habeo saperet eam, quo magna idque latine ei, sit diam errem mnesarchum cu. Est exerci aliquip viderer ut. Has porro detraxit abhorreant ut, debet aliquam ei ius, ut per semper laoreet elaboraret.\r\n" + //
						"\r\n" + //
						"Natum prima labitur mea id. At vis mundi simul qualisque. Usu scripta intellegam at, aeque electram constituam at vel, at duo altera laoreet quaestio. Ad debet sonet intellegebat vim, invidunt expetendis quo no. Mea euismod liberavisse complectitur cu. Ad mea audiam efficiendi, affert molestie ea eos. Vix ad nisl dicat soluta.";
		for (int i = 1; i <= 22; i++) {
			System.out.print("레벨 "+i+"에 대한 압축");
			ZstandardService.Benchmarking(s,i);
		}
	}

}
