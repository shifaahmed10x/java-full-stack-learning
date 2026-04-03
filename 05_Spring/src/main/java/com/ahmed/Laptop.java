package com.ahmed;

public class Laptop implements Computer {
    int gen;

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public  void name(){
        System.out.println("ASUS");
    }
    @Override
    public void compile(){
        System.out.println("compiling using Laptop");
    }

    public Laptop() {
        System.out.println("Laptop object created");
    }
}
