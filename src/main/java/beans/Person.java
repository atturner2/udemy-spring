package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {


    private String name;
    private final Vehicle vehicle;



    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
        System.out.println("Person bean created by Spring with vehicle autowired");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }




}
