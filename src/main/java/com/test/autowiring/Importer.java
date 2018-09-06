package com.test.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Component that makes use of an autowired object. aka Wired.
 *
 * It also constructs the autowired object using the Java lifecycle. i.e. Via the constructor
 * which means the Wired object is initialized by the time it's Autowired by Spring.
 *
 * Turns out Spring overrides the object created by the Java lifecycle.
 */
@Component
@Scope("prototype")
public class Importer {

    @Autowired
    private Wired wired;

    public Importer() {
        // The wired object created here by the constructor is overridden by the @Autowired instance
        this.wired = new Wired();
        this.wired.setName("Constructor");
    }

    public void sayHello() {
        System.out.println("Hello from " + wired.getName());
    }
}
