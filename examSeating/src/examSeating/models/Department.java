package examSeating.models;

import java.io.Serializable;

public class Department implements Serializable {
	
	private int id;
	private String name;
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	public String display() {
		return "Department [id=" + id + ", name=" + name + "]";
	}


	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
	
	
}
