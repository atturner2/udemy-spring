package beans;
import org.springframework.stereotype.Component;


//This annotation in used instead of the @Bean annotation
@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("This is the hello method from the Vehcile class");
    }
}
