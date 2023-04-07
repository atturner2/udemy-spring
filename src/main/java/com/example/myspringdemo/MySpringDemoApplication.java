package com.example.myspringdemo;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MySpringDemoApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var myVehicle = context.getBean(Vehicle.class);
        System.out.println("Here is the name before we set it, shoudl be null: " + myVehicle.getName());
        myVehicle.setName("Chevrolet Corvette");

        System.out.println("Here is the name from the vehicle: " + myVehicle.getName());
        myVehicle.printHello();

    }

}
