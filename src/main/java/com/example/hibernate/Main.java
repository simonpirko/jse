package com.example.hibernate;

import com.example.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration hibernate = new Configuration().addAnnotatedClass(User.class);
        SessionFactory sessionFactory = hibernate.buildSessionFactory();
        Session session = sessionFactory.openSession();

//        session.beginTransaction();
        User user = new User();
        user.setFirstName("Vic");
        user.setLastName("Pir");
        user.setStatusId(25);
        session.save(user);
//        session.flush();
//        session.beginTransaction().commit();

//        Session session2 = sessionFactory.openSession();
//        Query query = session.createQuery("select s.firstName from User s");
//        query.getResultList().forEach(System.out::println);
//        System.out.println(session);
//        System.out.println(session2);
//        session.flush();
//        System.out.println(session.load(User.class, 109).getId());
//        System.out.println(session.load(User.class, 109).getFirstName());
        sessionFactory.close();
//        session2.flush();
//        session.close();
//        session2.close();
    }
}
