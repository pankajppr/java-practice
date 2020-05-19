package org.testspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;


@Entity
public class Circle {
	@Id
	private int id;
	private String name;
	public Circle(){
		
	}
	public Circle(int circleId, String name){
		setId(circleId);
		setName(name);
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
}
