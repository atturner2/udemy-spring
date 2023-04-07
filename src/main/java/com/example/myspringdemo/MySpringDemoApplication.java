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

        //in order to use this naming convention you have to give the beans
        //a specific name. alternatively, the bean name will be the method name, like you see
        //in the first example
        Vehicle veh1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
        //this will throw a NoSuchBeanDefinitionException because there is no bean with this name.
        //if you don't name the beans, then you get NoUniqueBeanDefinition
        Vehicle veh4 = context.getBean("There isnt a vehicle with this name",Vehicle.class);
        System.out.println("Vehicle that doesnt exist from Spring Context is: " + veh4.getName());
    }

}
