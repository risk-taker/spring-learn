package com.example.springdemo.com.springcore.ConstructorArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.springcore/ConstructorArg.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
