package examSeating.controller;
import java.util.*;
import java.io.*;

import examSeating.models.*;
import examSeating.dao.*;


public class Main {
	
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		
		DAO dao=new DAO();
		
//		get list from file
		String filename = "file.ser";
		try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            dao.blocks= (List<Block>)in.readObject();
            dao.floors= (List<Floor>)in.readObject();
            dao.rooms= (List<Room>)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
         
        catch(Exception ex)
        {
            System.out.println("Exception is caught");
        }
		
		
		
		
		
		
// creating	operation	
		
		int createChoice;
		
		do {
			System.out.println("Menu\n1.Block\n2.Floor\n3.Room\n4.exit");
			createChoice=Integer.parseInt(sc.nextLine());
			if(createChoice==1) {
				System.out.print("Enter Block id :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter Block name :");
				String name=(sc.nextLine());
				System.out.print("Enter Block no of Floor :");
				int noOfFloor=Integer.parseInt(sc.nextLine());
				Block b=dao.createBlock(id,name,noOfFloor);
				System.out.println(b);
			}else if(createChoice==2) {
				System.out.print("Enter Floor id :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter floor name :");
				String name=(sc.nextLine());
				System.out.print("Enter floor no of Rooms :");
				int noOfRooms=Integer.parseInt(sc.nextLine());
				Block b;
				do {
					System.out.print("name the block");
					b=dao.getBlock(sc.nextLine());
				}while(b==null);
				if(b.getFloors().size()<b.getNoOfFloor()) {
					Floor f=dao.createFloor(id,name,noOfRooms,b);
					b.addFloor(f);
				}else {
					System.out.println("No floor left in this block");
				}
			}else if(createChoice==3) {
				System.out.print("Enter Room id :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter Room name :");
				String name=(sc.nextLine());
				Block b;
				do {
					System.out.print("name the block");
					b=dao.getBlock(sc.nextLine());
				}while(b==null);
				List<Floor> floors=b.getFloors();
				Floor floor=null;
				do {
					System.out.print("name the Floor");
					String floorName=sc.nextLine();
					for(Floor f:floors) {
						if(f.getName().equalsIgnoreCase(floorName)) 
							floor=f;							
					}
					
					
				}while(floor==null);
				if(floor.getRooms().size()<floor.getNoOfRooms()) {
					System.out.print("Enter rows :");
					int rows=Integer.parseInt(sc.nextLine());
					System.out.print("Enter columns :");
					int cols=Integer.parseInt(sc.nextLine());
					System.out.print("Enter floor no of tables :");
					int noOfTables=Integer.parseInt(sc.nextLine());
					Room r=dao.createRoom(id, name, floor,rows,cols,noOfTables);
					floor.addRoom(r);
				}else {
					System.out.println("No Room left in this Floor");
				}
				
			}else if(createChoice==4) {
				System.out.println("Bye");
			}else {
				System.out.println("Invalid input");
			}
			System.out.println("------------------------------------------");
			
		}while(createChoice!=4);
		
		
		for(Block b:dao.blocks) {
			System.out.println(b);
		}
		
//		upload to file
		
        try
        {  
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            // Method for serialization of object
            out.writeObject(dao.blocks);
            out.writeObject(dao.floors);
            out.writeObject(dao.rooms);
             
            out.close();
            file.close();
             
            System.out.println("Object has been serialized");
 
        }
         
        catch(Exception ex)
        {
            ex.printStackTrace();;
        }
		
	}

}
