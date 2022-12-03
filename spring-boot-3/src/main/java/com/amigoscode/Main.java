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

import java.util.List;
import java.util.Objects;

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
        return new GreetResponse(
                "Hello Geeks!",
                List.of("Java", "GoLang", "JavaScript"),
                new Person("Lalit Siraswa")
                );
    }
    record Person(String name){}

//    The Below both the GreetResponse Classes are exact same.
    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){}

//    class GreetResponse{
//        private final String greet;
//        public GreetResponse(String greet) {
//            this.greet = greet;
//        }
//        public String getGreet() {
//            return greet;
//        }
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }
}
