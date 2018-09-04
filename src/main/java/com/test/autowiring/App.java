package com.test.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * The 'main' class. It simply uses an Importer loaded by the Spring lifecycle.
 */
@ComponentScan
public class App {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Importer importer = context.getBean(Importer.class);
        importer.sayHello();
    }

}

