package beans;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


//no bean will be created here because there is no @annotation, even with the component scan in the appliation main
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Vehicle name is - " + name;
    }

    public void printHello() {
        System.out.println("This is the hello method from the Vehcile class");
    }
}
