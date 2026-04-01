package com.ahmed;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private int roll;
    private Computer com;

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.com= lap;
//    }
//
//    public  Alien(){
//        System.out.println("object created");
//    }

//    use Annotation when using name property in xml
//    @ConstructorProperties({"age","lap","roll"})
//    public Alien(int age, Computer com,int roll) {
//        this.age = age;
//        this.lap = lap;
//        this.roll=roll;
//    }

    public void code(){
        System.out.println("coding..");
        com.compile();
    }
}
