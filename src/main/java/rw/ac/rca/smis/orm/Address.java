package rw.ac.rca.smis.orm;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.SessionFactory;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.*;
import javax.imageio.spi.ServiceRegistry;
@Entity
@Table(name ="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String streetAddress;
	private String postalCode;
	
	@OneToMany
	private Set<Student>students;

	
	@OneToMany
	private Set<Instructor>instructors;

	
	public Address(String name,String streetAddress,String postCode) {
		this.name = name;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;	
	}

	public SessionFactory buildSessionFactory(ServiceRegistry serviceRegistry) {
		// TODO Auto-generated method stub
		return null;
	}
}