package com.kuta.just8023.service.imp;

import org.springframework.stereotype.Service;

import com.kuta.just8023.service.HelloWorldService;

@Service("helloWorldService")
public class HelloWorldServiceImp implements HelloWorldService{

	private String name;
	 
    public void setName(String name) {
        this.name = name;
    }
 
    public String sayHello() {
        return "Hello, " + name;
    }
}
