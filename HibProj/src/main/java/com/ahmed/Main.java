package com.ahmed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Employee ep1 = new Employee();
        ep1.setEmp_id(5);
        ep1.setName("Nezuko");
        ep1.setAge(20);

        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(ep1);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(ep1);
    }
}
