package config;

import beans.Person;
import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//This ComponentScan will not add anything to the spring context because there are no annotaions in the vehicle file

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Corvette, this is where the vehicle comes from down below, it's passing the beans in because it looks for them. If you remove this bean you get an error making the person and that's why.");
        return vehicle;
    }

    //instantiating this vehicle as part of the person class is what wires the relationship between the two, and ensures
    //only one vehicle is created
    /*
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Alex");
        person.setVehicle(vehicle());
        return person;
    }
    */
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Alex");
        person.setVehicle(vehicle);
        return person;
    }

}

