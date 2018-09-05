package com.test.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The 'main' class. It simply uses an Importer loaded by the Spring lifecycle.
 */
@ComponentScan
@Configuration
public class App {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Importer importer = context.getBean(Importer.class);
        importer.sayHello();
    }

    /**
     * This bean overrides the default name set in the Importer's constructor.
     * Except if null is returned then the default is used.
     * @return
     */
    @Bean
    public Wired wired() {
        Wired wired = new Wired();
        wired.setName("Bean");
        return wired;
    }

}

