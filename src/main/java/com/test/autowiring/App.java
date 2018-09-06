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

        // Test out prototype scope
        Importer importer2 = context.getBean(Importer.class);
        Importer importer3 = context.getBean(Importer.class);
    }

    /**
     * This bean overrides
     *  the wired object created by the Importer's constructor
     *  the @Component instance created for Wired
     *
     * But if null is returned here then the Importer's constructor instance is used.
     * i.e. null overrides the instance created via Wired's @Component
     */
    @Bean
    public Wired wired() {
        Wired wired = new Wired();
        wired.setName("Bean");
        return wired;
//        return null;
    }

}

