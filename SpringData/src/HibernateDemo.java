import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testspring.dao.HibernateDaoImpl;
import org.testspring.dao.JdbcDaoImpl;
import org.testspring.model.Circle;


public class HibernateDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println(dao.getCircleCount());

	}

}
