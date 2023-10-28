package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);
        CocheRepository repository = context.getBean(CocheRepository.class);

        System.out.println("FInd");
        System.out.println(repository.count());

        // Crear y almacenar un coche en la base de datos
        Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
        repository.save(toyota);

        System.out.println("El num de coche en la base de datos es: " + repository.count());

        // Recuperar todos los coches en la DB
        System.out.println(repository.findAll());
    }

}
