package org.pankaj.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component(value = "circle")
public class Circle implements Shape{
	
	@Autowired
	@Qualifier(value="circleRelated")
	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	@Override
	public void draw() {
		System.out.println("Printing Circle: ");
		System.out.println("Circle Center : ("+getCenter().getX()+", "+getCenter().getY()+")");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Message", null));
		
	}
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((messageSource == null) ? 0 : messageSource.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (messageSource == null) {
			if (other.messageSource != null)
				return false;
		} else if (!messageSource.equals(other.messageSource))
			return false;
		return true;
	}

}
