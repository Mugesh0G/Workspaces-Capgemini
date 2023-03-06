import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.util.CalendarFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CalendarFactory calender = applicationContext.getBean(CalendarFactory.class);
        calender.addDate(2);

       SpeakerService service = applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getValueNum());
        SpeakerService service1 = applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service1);

      /*  try {
            System.out.println(calender.getObject());
        }
        catch (Exception e){
            System.out.println("Exception occoured: "+e);
        }*/
        /*SpeakerService service = new SpeakerService();
        //service.setRepository(new HibernateSpeakerRepository());
        System.out.println(service.findAll().get(0).getFirstName());*/
    }

}
