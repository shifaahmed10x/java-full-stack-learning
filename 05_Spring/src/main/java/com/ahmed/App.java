package com.ahmed;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create a container + object
        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.age);
        obj1.age=21;
        obj1.code();

        Alien obj2=(Alien) context.getBean("alien");
        System.out.println(obj2.age);
    }
}
