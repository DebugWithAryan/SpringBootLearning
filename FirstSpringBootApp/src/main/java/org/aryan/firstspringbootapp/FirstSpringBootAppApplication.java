package org.aryan.firstspringbootapp;

import org.aryan.firstspringbootapp.model.Alien;
import org.aryan.firstspringbootapp.model.Laptop;
import org.aryan.firstspringbootapp.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootAppApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(FirstSpringBootAppApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);


//        Alien alien = context.getBean(Alien.class);
//        System.out.println(alien.getAge());
//        alien.code();


    }

}
