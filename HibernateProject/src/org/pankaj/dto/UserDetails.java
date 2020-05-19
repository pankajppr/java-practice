package org.pankaj.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class UserDetails {
	
	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="USER_ID")
	private int userId;
	
	@Column (name="USER_NAME")
	private String userName;
	
	@ElementCollection
	@JoinTable (name="USER_ADDRESS",
				joinColumns=@JoinColumn (name="USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column (name="ADDRESS_ID")}, generator = "hilo-gen", type = @Type (type="long"))
	private List<Address> listofAddress = new ArrayList<Address>();
	
	@OneToOne
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Collection<Address> getListofAddress() {
		return listofAddress;
	}
	public void setListofAddress(List<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	public String getUserName() {
		return userName+" from getUser()";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
