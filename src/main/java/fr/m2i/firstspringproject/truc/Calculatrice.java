package fr.m2i.firstspringproject.truc;

import org.springframework.stereotype.Component;

public class Calculatrice {

    public static Integer addition(Integer x, Integer y) {
        return x + y;
    }

    public static Integer soustraction(Integer x, Integer y) {
        return x - y;
    }

    public static Integer division(Integer x, Integer y) {
        return x / y;
    }

    public static Integer multiplication(Integer x, Integer y) {
        return x * y;
    }
}
