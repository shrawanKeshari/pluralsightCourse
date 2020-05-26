import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		// Use Spring configuration
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//		SpeakerService service = new SpeakerServiceImpl();

		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getSeedNum());
	}
}
