package examSeating.dao;
import java.io.*;
import java.util.*;
import examSeating.models.*;

public class DepartmentDao {
	
	public List<Department> deptList;
	String filename = "department.ser";
	
	public DepartmentDao(){
		deptList=new ArrayList<>();
		
		try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            deptList= (List<Department>)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
         
        catch(Exception ex)
        {
            System.out.println("Exception is caught");
        }
	}
	
	public void createDepartment(Department s) {
		deptList.add(s);
	}
	
	public Department getDepartment(String name){
		Department s=null;
		for(Department st:deptList) {
			if(st.getName().equalsIgnoreCase(name))
				return st;
		}
		return s;
	}
	public void display() {
		for(Department st:deptList) {
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
	            out.writeObject(deptList);
	   
	             
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
