package com.filemon.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//This class will be created as a singleton class
public final class SessionFactoryGet {

	private static volatile SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory(){
		synchronized(SessionFactoryGet.class){ // thread safe singleton
		if(sessionFactory == null){
		
			Configuration configuration = new Configuration();
	        configuration.configure();
	        System.out.println("Hibernate Configuration loaded");
	        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()). buildServiceRegistry();
	        System.out.println("Hibernate serviceRegistry created");
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	        
		}
		return sessionFactory;
	  }
     }
}

//class SessionFactoryGetChild extends SessionFactoryGet{ }// someone can extend this class and can clone
	