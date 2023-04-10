package config;

import beans.Person;
import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//This ComponentScan will not add anything to the spring context because there are no annotaions in the vehicle file

@ComponentScan(basePackages = "beans")
@Configuration
public class ProjectConfig {


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



}

