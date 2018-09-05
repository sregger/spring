package com.test.autowiring;

import org.springframework.stereotype.Component;

/**
 * Basic Bean with a configurable name.
 */
@Component
public class Wired {

    // Default name given to the Component when it is constructed
    private String name = "Default";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
