package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Reading {

    public static void readById(){

        SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        User user = session.get(User.class,2); // Here second parameter is primary key id.

        System.out.println(user.toString());

        factory.close();
    }

    public static void readAll(){
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        List<User> users = session.createQuery("from User").list();

        System.out.println("-----------------------------------------------------");
        for (User temp: users) {
            System.out.println(temp);
        }
        System.out.println("-----------------------------------------------------");

        users = session.createQuery("from User s where s.id = '1'").list();

        System.out.println("-----------------------------------------------------");
        for (User temp: users) {
            System.out.println(temp);
        }
        System.out.println("-----------------------------------------------------");

        factory.close();
    }

}
