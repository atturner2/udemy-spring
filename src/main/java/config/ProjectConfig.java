package config;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//This ComponentScan will not add anything to the spring context because there are no annotaions in the vehicle file

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {


}

