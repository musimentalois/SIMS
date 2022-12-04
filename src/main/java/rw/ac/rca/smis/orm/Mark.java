package rw.ac.rca.smis.orm;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mark")
public class Mark {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String subject;
	private float maxMark;
	
	@ManyToOne
	@JoinColumn(name = "course")
	private  Course course;
    
	
	@OneToMany
	private Set<Student>students;

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getMaxMark() {
		return maxMark;
	}

	public void setMaxMark(float maxMark) {
		this.maxMark = maxMark;
	}

	
}
