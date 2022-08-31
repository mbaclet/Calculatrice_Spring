package fr.m2i.firstspringproject.service;

import fr.m2i.firstspringproject.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }

}
