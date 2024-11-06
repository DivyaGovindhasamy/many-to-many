package many_to_many_uni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String code;
	
	@ManyToMany(cascade =CascadeType.PERSIST)
	List<Student> student;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Batch(int id, String name, String code, List<Student> student) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.student = student;
	}

	public Batch() {

	}

	@Override
	public String toString() {
		return "Batch [id=" + id + ", name=" + name + ", code=" + code + ", student=" + student + "]";
	}

	
	
	
	
	
}
