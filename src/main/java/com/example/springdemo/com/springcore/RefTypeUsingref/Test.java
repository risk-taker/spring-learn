package com.example.springdemo.com.springcore.RefTypeUsingref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.springcore/RefTypeUsingref.xml");
        A obja = (A) context.getBean("a");

        System.out.println(obja);
    }
}
