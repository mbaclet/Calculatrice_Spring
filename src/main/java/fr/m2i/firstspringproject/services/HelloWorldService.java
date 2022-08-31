package fr.m2i.firstspringproject.services;

import fr.m2i.firstspringproject.models.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }

}
