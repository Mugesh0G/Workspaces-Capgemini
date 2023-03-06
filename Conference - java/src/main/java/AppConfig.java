import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

   /* @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        SpeakerService service = new SpeakerService(getSpeakerRepository());
        //SpeakerService service = new SpeakerService();
        //service.setRepository(getSpeakerRepository());
        return service;
    }
    @Bean(name="speakerServiceNoArgs")
    public SpeakerService getSpeakerServiceNoArgs(){
        SpeakerService service = new SpeakerService();
        return service;
    }
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepository();
    }*/
}
