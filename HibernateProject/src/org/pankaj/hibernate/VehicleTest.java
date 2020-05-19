package org.pankaj.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.pankaj.dto.FourWheeler;
import org.pankaj.dto.TwoWheeler;
import org.pankaj.dto.Vehicle;
import org.pankaj.util.SessionFactoryGet;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setvehicleName("Car");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setvehicleName("Bike");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler car = new FourWheeler();
		car.setvehicleName("Porsche");
		car.setSteeringWheel("Porsche Steering Wheel");
		
		// Get SessionFactory object
        SessionFactory sessionFactory = new SessionFactoryGet().getSessionFactory();
        // Create a session from SessionFactory
        Session session = sessionFactory.openSession();
        // Begin Transaction
        session.beginTransaction();
        
		 session.save(vehicle);
		 session.save(bike);
		 session.save(car);
		 
		 // Commit Transaction
		 session.getTransaction().commit();
		 // close the session
		 session.close();

	}

}
