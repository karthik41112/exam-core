package examSeating.dao;
import java.io.*;

import java.util.*;
import examSeating.models.*;

public class StudentDao {
	
	public List<Student> studentList;
	String filename = "student.ser";
	
	public StudentDao(){
		studentList=new ArrayList<>();
		
		try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            studentList= (List<Student>)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
         
        catch(Exception ex)
        {
            System.out.println("Exception is caught");
        }
	}
	
	public void createStudent(Student s) {
		studentList.add(s);
	}
	
	public Student getStudent(String name){
		Student s=null;
		for(Student st:studentList) {
			if(st.getName().equalsIgnoreCase(name))
				return st;
		}
		return s;
	}
	
	public void display() {
		for(Student st:studentList) {
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
	            out.writeObject(studentList);
	   
	             
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
