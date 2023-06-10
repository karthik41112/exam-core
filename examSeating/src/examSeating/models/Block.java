package examSeating.models;

import java.io.Serializable;
import java.util.*;

public class Block implements Serializable{
	
	private int id;
	private String name;
	private int NoOfFloor;
	private List<Floor> floors=new ArrayList<Floor>();
	
	
	public Block() {
		super();
		
	}
	
	
	public Block(int id,String name, int noOfFloor) {
		super();
		this.id=id;
		this.name = name;
		NoOfFloor = noOfFloor;
	}


	public int addFloor(Floor f) {
		if(floors.size()<NoOfFloor) {
			floors.add(f);
			return 1;
		}
		return 0;
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
	public int getNoOfFloor() {
		return NoOfFloor;
	}
	public void setNoOfFloor(int noOfFloor) {
		NoOfFloor = noOfFloor;
	}
	public List<Floor> getFloors() {
		return floors;
	}
	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}


	@Override
	public String toString() {
		return "Block\nname=" + name + "\nNoOfFloor=" + NoOfFloor + "\nfloors=" + floors+"\n";
	}
	
	
	

}
