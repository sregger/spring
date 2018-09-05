package com.test.autowiring;

/**
 * Basic Bean with a configurable name.
 */
// Disabling @Component to use @Bean which allows me to define a null
//@Component
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
