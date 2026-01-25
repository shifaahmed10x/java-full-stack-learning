package com.ahmed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
//import java.util.List;


public class Main {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.setLid(1);
        l1.setBrand("lenevo");
        l1.setModel("rog");
        l1.setRam(12);

        Laptop l2= new Laptop();
        l2.setLid(2);
        l2.setRam(12);
        l2.setBrand("Asus");
        l2.setModel("VOH");

        Laptop l3=new Laptop();
        l3.setLid(3);
        l3.setBrand("Dell");
        l3.setModel("XPS");
        l3.setRam(18);

        Employee ep1 = new Employee();
        ep1.setEmp_id(12);
        ep1.setName("Shan");
        ep1.setAge(56);

        Employee ep2 = new Employee();
        ep2.setEmp_id(19);
        ep2.setName("Alex");
        ep2.setAge(67);

        ep1.setLaptops(Arrays.asList(l1,l2));
        ep2.setLaptops(Arrays.asList(l3));


//        Employee ep2=null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.ahmed.Employee.class)
                .addAnnotatedClass(com.ahmed.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

//USED TO STORE DATA
//    Transcation is used when you manipulate the database ,not for fetching
        Transaction transaction = session.beginTransaction();
        session.persist(ep1);
        session.persist(ep2);
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        transaction.commit();

// USED TO FETCH DATA
//         fetching values
//        ep2=session.get(Employee.class,1);
        Employee ep4 = session.find(Employee.class,12);
        System.out.println(ep4);
//
// used to update
//        Transaction transaction = session.beginTransaction();
//          session.merge(ep1); // update data ,if new then add
//          transaction.commit()
//
//  used to delete record
//  ep2 = session.find(Employee.class,3);
//  Transaction transaction = session.beginTransaction();
//  session.remove(ep2);
//  transaction.commit();
        session.close();
        sf.close();

//        System.out.println(ep1);
    }
}
