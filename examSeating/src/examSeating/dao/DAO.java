package examSeating.dao;
import java.util.*;

import examSeating.models.*;

public class DAO {
	
	public List<Block> blocks=new ArrayList<>();
	public List<Floor> floors=new ArrayList<>();
	public List<Room> rooms=new ArrayList<>();

	public Block createBlock(int id,String name,int noOfFloor) {
		Block b=new Block(id,name,noOfFloor);
		blocks.add(b);
		return b;
	}
	
	public Block getBlock(String name) {
		for(Block b:blocks) {
			if(b.getName().equalsIgnoreCase(name))
				return b;
		}
		return null;
	}
	
	public Floor createFloor(int id,String name,int noOfRooms,Block b) {
		Floor f=new Floor(id,name,noOfRooms,b);
		floors.add(f);
		return f;
	}
	
	public Room createRoom(int id,String name,Floor f,int rows,int cols,int noOftables) {
		Room r=new Room(id,name,f,rows,cols,noOftables);
		rooms.add(r);
		return r;
	}
	
}
