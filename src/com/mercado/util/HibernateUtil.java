/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.util;

/**
 *
 * @author Juan
 */
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;
    
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("com/example/pyfirsthibernate/hibernate.cfg.xml");
            System.out.println("Hibernate Configuration loaded");
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            System.out.println("Hibernate serviceRegistry created");   
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void closeSessionFactory() {
       if(sessionFactory!=null)
            sessionFactory.close();
      if(serviceRegistry!=null)
           StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }

}
