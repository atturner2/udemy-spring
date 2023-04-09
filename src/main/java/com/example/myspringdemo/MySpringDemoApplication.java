package com.example.myspringdemo;

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

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle corvette = context.getBean(Vehicle.class);

        System.out.println("Here is the vehicle name from the spring xml context: " + corvette.getName());


    }

}
