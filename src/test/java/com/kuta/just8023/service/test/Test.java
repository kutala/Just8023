package com.kuta.just8023.service.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuta.just8023.service.HelloWorldService;

public class Test {

    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
 
        HelloWorldService service = (HelloWorldService) context
                .getBean("helloWorldService");
        String message = service.sayHello();
        System.out.println(message);
    }
}
