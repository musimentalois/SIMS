package rw.ac.rca.smis.orm;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import rw.ac.rca.smis.orm.Mark;
import rw.ac.rca.smis.orm.Student;

@Entity
@Table(name ="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	int period;
	double maxMark;
	
	@ManyToMany
	private Set<Student> students;
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@OneToMany
	private Set<Mark> marks;
	
	
	
	@ManyToMany 
	private Set<Instructor> instructors;
	

	public Set<Instructor> getInstructors() {
		return instructors;
	}
	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
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

	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(double maxMark) {
		this.maxMark = maxMark;
	}
  
}
