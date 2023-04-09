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
        vehicle.setName("Corvette");
        return vehicle;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Alex");
        person.setVehicle(vehicle());
        return person;
    }

}

