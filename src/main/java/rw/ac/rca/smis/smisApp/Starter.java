
package rw.ac.rca.smis.smisApp;
import java.util.Date;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rw.ac.rca.smis.orm.Address;
import rw.ac.rca.smis.orm.Course;
import rw.ac.rca.smis.orm.Instructor;
import rw.ac.rca.smis.orm.Mark;
import rw.ac.rca.smis.orm.Student;
public class Starter {
	public static void main(String[] args) {
		Address add= new Address("Kigali","KN59 ST 13","12346" );
		
		Date date = new Date();
		Instructor lois = new Instructor();
		lois.setAddress(add);
		Course course1 = new Course();
		Student student1 = new Student(course1,"lois",date,'f',add);
		Mark mark = new Mark();
		
			
//		BasicConfigurator.configure();
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println(" Beginning transaction...........");
		Transaction transaction = session.beginTransaction();
		
		//saving objects
		session.saveOrUpdate(add);
		session.saveOrUpdate(course1);
		session.saveOrUpdate(lois);
		session.saveOrUpdate(student1);
		session.saveOrUpdate(mark);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
}