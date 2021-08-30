package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void deleteById(){
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.createQuery("delete from User where id = 2").executeUpdate();
        session.getTransaction().commit();
        factory.close();

    }
}
