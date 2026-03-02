package com.ahmed;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Objects;

public class HQL_main {
    public static void main(String[] args){

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.ahmed.Laptop.class)
                .configure()
                .buildSessionFactory();

       // Session session = sf.openSession();


// USE OF HQL IN HIBERNATE
        //Fetching data
//         String brand = "Asus"  ;
//         Query query = session.createQuery("from Laptop where brand like ?1");
//         query.setParameter(1,brand);
//         List<Laptop> laptopList = query.getResultList();
//        System.out.println(laptopList);

        //passing 2 parameters in Select
//        String brand = "Asus";
//        Query query1 = session.createQuery("select brand , model from Laptop where brand like ?1 ");
//        query1.setParameter(1,brand);
//        List<Object[]> objectsList = query1.getResultList();
//
//        for(Object[] data: objectsList){
//            System.out.println((String)data[0] + " : " + (String)data[1] );
//        }
        Session session = sf.openSession();

        Laptop l1 = session.find(Laptop.class,10);
        System.out.println(l1);



        session.close();

        Session session1 = sf.openSession();
        Laptop l2 = session1.find(Laptop.class,10);
        System.out.println(l2);
        session1.close();

        sf.close();

    }
}
