package fr.m2i.firstspringproject.model;

public class HelloWorld {

    private String value;

    public HelloWorld() {

        this.setValue ("Bonjour monde");
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }

    @Override
    public String toString() {

        return  this.getValue();
    }
}
