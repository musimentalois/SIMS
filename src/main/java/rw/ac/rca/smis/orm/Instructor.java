package rw.ac.rca.smis.orm;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="Instructor")

public class Instructor {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 private String contact;
@ManyToOne
private Address address;

@ManyToMany
private Set<Course> courses;


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
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public void setAddress(Address add) {
	
	
}
 
 

}
