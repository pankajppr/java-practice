package org.springmvc.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
@Entity
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String disease;
	private Long mobile;
	private Date dob;
	
	private ArrayList<String> symptoms;
	@Override
	public String toString(){
		return "id: "+ Integer.valueOf(id) + "Name: " + name +
				"Disease: " + disease + "Mobile: " + Long.valueOf(mobile) +
				"DOB: " + dob.toString() + "Symptoms: " + symptoms;
				
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@ElementCollection
	@CollectionTable(name="Symptoms", joinColumns=@JoinColumn(name="id"))
	@Column(name="symptoms")
	public ArrayList<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(ArrayList<String> symptoms) {
		this.symptoms = symptoms;
	}

}
