package org.pankaj.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (
		name="VEHICLE_TYPE",
		discriminatorType = DiscriminatorType.STRING
		)
public class Vehicle {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;	
	private String vehicleName;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getvehicleName() {
		return vehicleName;
	}

	public void setvehicleName(String vahicleName) {
		this.vehicleName = vahicleName;
	}
}
