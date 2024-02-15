package com.example.springdemo.com.springcore.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.springcore/CollectionType.xml");
        Emp em1 = (Emp) context.getBean("emp");

        System.out.println(em1);


    }
}
