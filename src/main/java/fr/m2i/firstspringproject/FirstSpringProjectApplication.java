package fr.m2i.firstspringproject;

import fr.m2i.firstspringproject.service.CalculatriceService;
import fr.m2i.firstspringproject.service.HelloWorldService;
import fr.m2i.firstspringproject.service.SaisieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner {

    @Autowired
    HelloWorldService helloWorldService;
    @Autowired
    SaisieService saisieService;

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(helloWorldService.getHelloWorld());

        System.out.println(saisieService.askSaisie());
    }
}
