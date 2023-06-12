package examSeating.dao;
import java.io.*;
import java.util.*;
import examSeating.models.*;

public class InvigilatorDao{
	
	public List<Invigilator> invigilatorList;
	String filename = "teacher.ser";
	
	public InvigilatorDao(){
		invigilatorList=new ArrayList<>();
		
		try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            invigilatorList= (List<Invigilator>)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
         
        catch(Exception ex)
        {
            System.out.println("Exception is caught");
        }
	}
	
	public void createInvigilator(Invigilator s) {
		invigilatorList.add(s);
	}
	
	public Invigilator getInvigilator(String name){
		Invigilator i=null;
		for(Invigilator it:invigilatorList) {
			if(it.getName().equalsIgnoreCase(name))
				return it;
		}
		return i;
	}
	public void display() {
		for(Invigilator it:invigilatorList) {
			System.out.println(it.display());
		}
	}
	
	public void upload() {
		 try
	        {  
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	            // Method for serialization of object
	            out.writeObject(invigilatorList);
	   
	             
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
