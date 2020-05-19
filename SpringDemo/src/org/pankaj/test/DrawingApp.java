package org.pankaj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {


	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		Shape shapeAnother = (Shape)context.getBean("circle");
		shape.draw();
		
		Shape shape1 = (Shape)context.getBean("circle1");
		shape1.draw();
		
			System.out.println("Shape == shapeAnother: " + (shape == shapeAnother));
			System.out.println("Shape == Shape1: " + (shape == shape1));
			System.out.println("Shape.equals(shape1): "+(shape.equals(shape1)));
		}
}
