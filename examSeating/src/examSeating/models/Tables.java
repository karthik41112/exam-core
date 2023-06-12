package examSeating.models;

import java.io.Serializable;
import java.util.*;

public class Tables implements Serializable {
	
	private int id;
	private Room room;
	private int noOfSeats;
	
	private List<Student> students=new ArrayList<>();
	
	public Tables(int id, Room room) {
		super();
		this.id = id;
		this.room = room;
	}

	public Tables() {
		super();
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	public void deleteStudents() {
		students=new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "{"+students+"}";
	}
	
	
	
	
	

}
