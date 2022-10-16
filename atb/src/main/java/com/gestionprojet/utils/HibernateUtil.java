package com.gestionprojet.utils;


//import java.util.Properties;

//import javax.persistence.PersistenceException;

//import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();
    private static ServiceRegistry serviceRegistry;
    public static Session session =null;
    public static SessionFactory buildSessionFactory(){
        
            try {
                Configuration configuration = new Configuration();
                configuration.configure("confg/hibernate.cfg.xml");
                configuration.addAnnotatedClass(com.gestionprojet.dao.entity.Client.class);
                configuration.addAnnotatedClass(com.gestionprojet.dao.entity.Agence.class);
                configuration.addAnnotatedClass(com.gestionprojet.dao.entity.Carte.class);
                configuration.addAnnotatedClass(com.gestionprojet.dao.entity.Compte.class);
                configuration.addAnnotatedClass(com.gestionprojet.dao.entity.Compte.class);

                	serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                	 return  configuration.buildSessionFactory(serviceRegistry);
            } catch (Throwable ex) {

                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
           
    }
  
    public static SessionFactory getSessionFactory() {
    	return  sessionFactory; 
    }
    public static Session openSession() {
    	return  sessionFactory.openSession(); 
    }
    public static Session getCurrentSession() {
    	return  sessionFactory.getCurrentSession(); 
    }
    public static void close() {
    	if(sessionFactory != null) {
    		sessionFactory.close();
    	}
    	sessionFactory = null; 
    }
}
// des methodes utils

