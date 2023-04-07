package beans;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void initialize() {
        this.name = "Chevrolet Corvette";

    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying this bean upon closure of the context");

    }

    public void printHello() {
        System.out.println("This is the hello method from the Vehcile class");
    }
}
