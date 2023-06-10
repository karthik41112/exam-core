package examSeating.models;

import java.util.*;
import java.io.Serializable;

public class Room implements Serializable{
	
	private int id;
	private String name;
	private Floor floor;
	
	private int rows;
	private int columns;
	private int noOfTables;
	
	private List<Tables> tables;
	
//	advance
	private int noOfSubjects;
	private Invigilator invg;
	private List<Subject> subjects=new ArrayList<>();
	private List<Student> students=new  ArrayList<>();
	private int TotalSeats;
	private int filledSeats;
	private int seatsItabel;
	
	
	
	
	@Override
	public String toString() {
		return "name=" + name ;
	}
	public Room() {
		super();
	}
	
	
	public Room(int id, String name, Floor floor, int rows, int columns, int noOfTables) {
		super();
		this.id = id;
		this.name = name;
		this.floor = floor;
		this.rows = rows;
		this.columns = columns;
		this.noOfTables = noOfTables;
		this.createTables();
	}
	
	//creating tables
	public void createTables() {
		tables=new ArrayList<>();
		int k=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(k<noOfTables) {
					
					String s=""+i+""+j;
					tables.add(new Tables(Integer.parseInt(s),this));
				}
				k++;
			}
		}
		k=0;
		for(int i=0;i<rows;i++) {
			System.out.print("[ ");
			for(int j=0;j<columns;j++) {
				if(k<noOfTables) {
					
					Tables t=tables.get(k++);
					System.out.print(t+" ");
				}
			}
			System.out.println("]");
		}
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
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int getNoOfTables() {
		return noOfTables;
	}
	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}
	
	
	//advance
	public List<Tables> getTables() {
		return tables;
	}
	public void setTables(List<Tables> tables) {
		this.tables = tables;
	}
	public int getNoOfSubjects() {
		return noOfSubjects;
	}
	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}
	public Invigilator getInvg() {
		return invg;
	}
	public void setInvg(Invigilator invg) {
		this.invg = invg;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getTotalSeats() {
		return TotalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		TotalSeats = totalSeats;
	}
	public int getFilledSeats() {
		return filledSeats;
	}
	public void setFilledSeats(int filledSeats) {
		this.filledSeats = filledSeats;
	}
	public int getSeatsItabel() {
		return seatsItabel;
	}
	public void setSeatsItabel(int seatsItabel) {
		this.seatsItabel = seatsItabel;
	}	

}
