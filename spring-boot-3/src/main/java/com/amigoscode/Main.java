package com.amigoscode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@ComponentScan(basePackages = "com.amigoscode")
@EnableAutoConfiguration
@Configuration
@RestController
public class Main {
    public static void main(String args[]){
        SpringApplication.run(Main.class, args);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public GreetResponse greet(){
        return new GreetResponse("Hello Geeks!");
    }
    record GreetResponse(String greet){}
}
