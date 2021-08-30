package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateAndSave {

    public static void createAndSave(){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            // Create a user object
            User user = new User("Berat Asrın","CAFEROĞLU","beratasrin01@gmail.com");

            // Start transaction
            session.beginTransaction();

            // Save the user
            session.save(user);

            // Commit the transaction
            session.getTransaction().commit();

        } finally {

            factory.close();

        }
    }

}
