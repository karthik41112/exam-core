package examSeating.controller;

import java.util.*;


import examSeating.dao.*;
import examSeating.models.*;

public class StuSubIng {
	
	public static void main(String a[]) {
		
		Scanner sc=new Scanner(System.in);
		
		StudentDao sdao=new StudentDao();
		InvigilatorDao idao=new InvigilatorDao();
		DepartmentDao ddao=new DepartmentDao();
		
		sdao.display();
		ddao.display();
		idao.display();
		
		int createChoice;
		do {
			System.out.println("menu\n1.Students\n2.Invigilator\n3.department\n4.exit");
			createChoice=Integer.parseInt(sc.nextLine());
			if(createChoice==1) {
				System.out.print("Enter Student id :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter Student name :");
				String name=(sc.nextLine());
				System.out.print("Enter Department  :");
				Department dept=ddao.getDepartment(sc.nextLine());
				if(dept!=null) {
					Student stu=new Student(id,name,dept);
					sdao.createStudent(stu);
				}else {
					System.out.println("NO dept");
				}
				
			}else if(createChoice==2) {
		
				System.out.print("Enter invigilator id :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter invigilator name :");
				String name=(sc.nextLine());
				System.out.print("Enter invigilator department:");
				Department dept=ddao.getDepartment(sc.nextLine());
				if(dept!=null) {
					Invigilator io=new Invigilator(id,name,dept);
					idao.createInvigilator(io);
				}else {
					System.out.println("NO dept");
				}
			}else if(createChoice==3) {
				System.out.print("Enter Department id :");
				int id=Integer.parseInt(sc.nextLine());
				System.out.print("Enter Department name :");
				String name=(sc.nextLine());
				Department dept=new Department(id,name);
				ddao.createDepartment(dept);
			}else if(createChoice==4) {
				System.out.println("Bye");
			}else {
				System.out.println("Invalid input");
			}
			System.out.println("------------------------------------------");
		
		}while(createChoice!=4);
		sdao.display();
		ddao.display();
		idao.display();
		sdao.upload();
		idao.upload();
		ddao.upload();
	
	
	}

}
