package com.ahmed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Level2cache {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.ahmed.Laptop.class)
                .buildSessionFactory();

        Session s1 = sf.openSession();
        Laptop l1 = s1.find(Laptop.class,10);
        System.out.println(l1);

        Laptop l2 = s1.find(Laptop.class,10);
        System.out.println(l2);

        s1.close();
        sf.close();


    }
}
