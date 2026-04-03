package com.ahmed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // =========================
        // 🔹 Using Laptop
        // =========================
//        System.out.println("=== Using Laptop ===");
//
//        Alien obj1 = (Alien) context.getBean("alien");
//
//        System.out.println("Age: " + obj1.getAge());
//        System.out.println("Roll: " + obj1.getRoll());
//        obj1.code();

        // =========================
        // 🔹 Using Desktop (Interface concept)
        // =========================
//        System.out.println("\n=== Using Desktop ===");
//
//        Alien obj2 = (Alien) context.getBean("alien2");
//
//        System.out.println("Age: " + obj2.getAge());   // FIXED
//        System.out.println("Roll: " + obj2.getRoll()); // FIXED
//        obj2.code();

        // =========================
        // 🔹 Extra Practice (Scope / multiple objects)
        // =========================
        /*
        Alien obj3 = (Alien) context.getBean("alien");
        System.out.println(obj3.getAge());
        obj3.code();
        */

        // =========================
        // 🔹 Autowiring Example
        // =========================
//        System.out.println("\n=== Using Autowiring ===");
//
//        Alien obj3 = (Alien) context.getBean("alienAuto");
//        System.out.println("Age: " + obj3.getAge());
//        System.out.println("Roll: " + obj3.getRoll());
//        obj3.code();

        // =========================
        // 🔹 Lazy Init Bean Example
        // =========================

        Alien obj4 = (Alien) context.getBean("alienLazy");
        System.out.println("Age: " + obj4.getAge());
        System.out.println("Roll: " + obj4.getRoll());
        obj4.code();


    }
}