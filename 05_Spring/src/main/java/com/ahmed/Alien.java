package com.ahmed;

import org.springframework.beans.factory.annotation.Autowired;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private int roll;

    //Autowiring
    private Computer com;

    // 🔹 Getter Methods
    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }

    public Computer getCom() {
        return com;
    }

    // 🔹 Setter Injection
    public void setAge(int age) {
        this.age = age;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("coding..");
        com.compile();
    }

    // 🔹 Constructor Injection

    // Default constructor
    public Alien() {
        System.out.println("Object created");
    }
/*
    // Use when working with constructor injection in XML
    // @ConstructorProperties({"age","com","roll"})
    // public Alien(int age, Computer com, int roll) {
    //     this.age = age;
    //     this.com = com;
    //     this.roll = roll;
    // }
*/
    // 🔹 OLD Laptop-based Code (for learning reference)
    /*
    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.com = lap;
    }
    */


}