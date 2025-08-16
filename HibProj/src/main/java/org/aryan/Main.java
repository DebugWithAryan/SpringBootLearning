package org.aryan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class, 1);
        System.out.println(l1);

        session.close();

        Session session2 = sf.openSession();

        Laptop l2 = session2.get(Laptop.class, 1);
        System.out.println(l2);

        session2.close();

        sf.close();

    }
}