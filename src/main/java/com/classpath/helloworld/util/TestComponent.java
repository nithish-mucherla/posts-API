package com.classpath.helloworld.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    private HelloWorld helloWorld;
    TestComponent(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
