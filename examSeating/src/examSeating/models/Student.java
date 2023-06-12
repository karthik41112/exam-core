package examSeating.models;
import java.io.Serializable;

import java.util.*;

public class Student implements Serializable {
	
	private int id;
	private String name;
	private Department dept;
	
	private ArrayList<Subject> subject=new ArrayList<>();
	
	
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

	public Student(int id, String name, Department dept, ArrayList<Subject> subject) {
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

	public void setSubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return   name ;
	}
	
	public String displaySubject(){
			
		String s=name+"\n";
		for(Subject stu:subject) {
			s+=stu.getSubCode()+"\n";
		}
		return s;
	}
	
	public String display() {
		return id+" "+name+" "+dept;
	}
	
	
	

}
