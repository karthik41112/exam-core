package examSeating.dao;
import java.io.*;

import java.util.*;
import examSeating.models.*;

public class SubjectDao {
		
	public List<Subject> subjectList;
	String filename = "subject.ser";
	
	public SubjectDao(){
		subjectList=new ArrayList<>();
		
		try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            subjectList= (List<Subject>)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
         
        catch(Exception ex)
        {
            System.out.println("Exception is caught");
        }
	}
	
	public void createSubject(Subject s) {
		subjectList.add(s);
	}
	
	public Subject getSubject(String name){
		Subject s=null;
		for(Subject st:subjectList) {
			if(st.getName().equalsIgnoreCase(name))
				return st;
		}
		return s;
	}
	
	public void display() {
		for(Subject st:subjectList) {
			System.out.println(st.display());
		}
	}
	
	public void upload() {
		 try
	        {  
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	            // Method for serialization of object
	            out.writeObject(subjectList);
	   
	             
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
