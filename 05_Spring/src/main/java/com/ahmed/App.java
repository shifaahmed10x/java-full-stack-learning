package com.ahmed;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InterfaceAddress;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create a container + object
        Alien obj1 = (Alien) context.getBean("alien");
//        Laptop laptop = (Laptop) context.getBean("lap2");

        System.out.println("for laptop");
        System.out.println("Age :" +obj1.getAge());
        System.out.println("Roll:" + obj1.getRoll());
        //System.out.println(obj1.getLap().getGen());
        obj1.code();
//
//        Alien obj2=(Alien) context.getBean("alien");
//        System.out.println(obj2.getAge());
//        obj2.code();

//        FOR CLASS Interface
        System.out.println("For Desktop");
        Alien obj2 = (Alien) context.getBean("alien2");
        System.out.println("Age :" +obj1.getAge());
        System.out.println("Roll:" + obj1.getRoll());
        obj2.code();


    }
}
