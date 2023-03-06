import com.pluralsight.service.SpeakerService;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerService();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
