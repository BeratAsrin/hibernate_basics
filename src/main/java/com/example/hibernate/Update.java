package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
    public static void update(){
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        User user = session.get(User.class, 1);
        user.setName("Unknown");

        session.getTransaction().commit();
        factory.close();
    }

    public static void updateAllMails(){
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        session.createQuery("update User set email='---@gmail.com'").executeUpdate();
        session.getTransaction().commit();

        factory.close();

    }
}
