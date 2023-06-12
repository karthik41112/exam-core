package examSeating.models;

import java.io.Serializable;
import java.util.*;

public class Subject implements Serializable{
	
	private int id;
	private String subCode;
	private String Name;
	private Department dept;
	public int allocatedFrom=0;
	
	private ArrayList<Student> students=new ArrayList<>();
	
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String displayStudent(){
		
		String s=subCode+"\n";
		for(Student stu:students) {
			s+=stu.getName()+"\n";
		}
		return s;
	}

	
	public String display() {
		return "[id=" + id + ", subCode=" + subCode + ", Name=" + Name + ", dept=" + dept + "]";
	}
	
}
