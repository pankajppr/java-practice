package org.pankaj.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionFactoryGet {
	
	public SessionFactory getSessionFactory(){
		
		Configuration configuration = new Configuration();
        configuration.configure();
        System.out.println("Hibernate Configuration loaded");
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()). buildServiceRegistry();
        System.out.println("Hibernate serviceRegistry created");
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
	}
}
