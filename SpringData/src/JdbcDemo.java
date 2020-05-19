import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testspring.dao.JdbcDaoImpl;
import org.testspring.model.Circle;


public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		dao.insertCircle(new Circle(2,"Second Circle"));
		
		System.out.println(dao.getCircleCount());
		System.out.println(dao.getCircleForId(1).getName());
		System.out.println(dao.getAllCircles().size());
		
		//dao.createTriangle();
	}

}
