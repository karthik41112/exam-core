package examSeating.models;

import java.util.*;

public class Subject {
	
	private int id;
	private String subCode;
	private String Name;
	private Department dept;
	
	private List<Student> students=new ArrayList<>();
	public Subject() {
		super();
	}
	public Subject(int id, String subCode, String name, Department dept) {
		super();
		this.id = id;
		this.subCode = subCode;
		Name = name;
		this.dept = dept;
	}
	
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}
