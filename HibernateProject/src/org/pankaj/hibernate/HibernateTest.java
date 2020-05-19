package org.pankaj.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.pankaj.dto.Address;
import org.pankaj.dto.UserDetails;
import org.pankaj.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		Address addr1 = new Address();
		addr1.setStreet("First Street");
		addr1.setCity("First City");
		addr1.setState("First State");
		addr1.setPincode("10001");
		
		Address addr2 = new Address();
		addr2.setStreet("Second Street");
		addr2.setCity("Second City");
		addr2.setState("Second State");
		addr2.setPincode("10002");
		
		user.getListofAddress().add(addr1);
		user.getListofAddress().add(addr2);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setvehicleName("Car");
		
		user.setVehicle(vehicle);
		
		
		Configuration configuration = new Configuration();
        configuration.configure();
        System.out.println("Hibernate Configuration loaded");
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()). buildServiceRegistry();
        System.out.println("Hibernate serviceRegistry created");
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.save(vehicle);
        session.getTransaction().commit();
        session.close();
        
        user=null;
        //Fetching the data
        session = sessionFactory.openSession();
        user = (UserDetails) session.get(UserDetails.class, 1);
        
        System.out.println(user.getListofAddress().size());

	}

}
