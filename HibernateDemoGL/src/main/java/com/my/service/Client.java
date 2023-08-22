package com.my.service;

import com.my.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();

        Session session=sessionFactory.getCurrentSession();

        session.beginTransaction();

        Query query =session.createSQLQuery("SELECT s FROM Student s WHERE s.rollNo > :rn")
                .setParameter("rn",13);
        List<Student> students=query.getResultList();



//        sessionFactory.close();

        session.getTransaction().commit();
        session.close();
    }
}
