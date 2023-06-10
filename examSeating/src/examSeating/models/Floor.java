package examSeating.models;

import java.io.Serializable;
import java.util.*;

public class Floor implements Serializable {
	
	private int id;
	private String name;
	private int noOfRooms;
	private List<Room> rooms=new ArrayList<Room>();
	private Block block;
	
	public Floor() {
		super();
	}
	
	
	
	
	
	public Floor(int id, String name, int noOfRooms, Block block) {
		super();
		this.id = id;
		this.name = name;
		this.noOfRooms = noOfRooms;
		this.block = block;
	}





	public int addRoom(Room room) {
		if(noOfRooms>rooms.size()) {
			rooms.add(room);
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
	
	
	public int getNoOfRooms() {
		return noOfRooms;
	}





	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}





	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}





	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", noOfRooms=" + noOfRooms + ", rooms=" + rooms ;
	}



	
	
}
