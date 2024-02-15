package com.example.springdemo.com.springcore.ConstructorArg;


public class Person {
    private String name;
    private int personId;
    private Certi Certi;

    public Person(String name, int personId, Certi certi) {
        this.name = name;
        this.personId = personId;
        this.Certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", Certi=" + Certi +
                '}';
    }
}
