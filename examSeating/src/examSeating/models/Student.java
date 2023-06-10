package examSeating.models;
import java.util.*;

public class Student {
	
	private int id;
	private String name;
	private Department dept;
	
	private List<Subject> subject;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public Student(int id, String name, Department dept, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.subject = subject;
	}
	//Adding subject
	public void addSub(Subject sub) {
		subject.add(sub);
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	

}
