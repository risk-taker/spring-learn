package com.example.springdemo.com.springcore.PSchema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.springcore/PSchema.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
    }
}
