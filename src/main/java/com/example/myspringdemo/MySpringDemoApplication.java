package com.example.myspringdemo;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;
import org.apache.logging.log4j.util.Supplier;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


@SpringBootApplication
public class MySpringDemoApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person alex = context.getBean(Person.class);
        Vehicle alexsCorvette = context.getBean(Vehicle.class);
        alex.setName("Alex");
        alexsCorvette.setName("Alex's Corvette");


        System.out.println("Person name from the spring context is: " + alex.getName());
        System.out.println("Car name from the spring context is: " + alexsCorvette.getName());
        System.out.println("Car name from the person object is: " + alex.getVehicle());


    }

}
