package beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.VehicleServices;


//no bean will be created here because there is no @annotation, even with the component scan in the appliation main
@Component("vehicleBean")
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }
    private String name;

    private VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return this.vehicleServices;
    }


    @Override
    public String toString(){
        return "Vehicle name is - " + name;
    }

    public void printHello() {
        System.out.println("This is the hello method from the Vehcile class");
    }
}
