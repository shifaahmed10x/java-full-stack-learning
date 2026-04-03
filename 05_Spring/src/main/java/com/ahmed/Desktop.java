package com.ahmed;

public class Desktop implements  Computer{
    public Desktop() {
        System.out.println("Desktop object Created");
    }

    @Override
    public void compile(){
        System.out.println("compiling USING DESKTOP");
    }
}
