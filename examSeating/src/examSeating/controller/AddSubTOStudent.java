package examSeating.controller;


import java.util.*;
import examSeating.dao.*;
import examSeating.models.*;

public class AddSubTOStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		StudentDao studao=new StudentDao();
		SubjectDao subdao=new SubjectDao();
		
		studao.display();
		subdao.display();
		System.out.println("Add subject ?(y/n)");
		char choice=sc.nextLine().charAt(0);
		while(choice=='y') {
			System.out.println("enter student id");
			Student stu=studao.getStudent(sc.nextLine());
			while(stu!=null) {
				System.out.println("enter subject code");
				Subject sub=subdao.getSubject(sc.nextLine());
				if(sub!=null) {
					stu.addSub(sub);
					sub.addStudent(stu);
					
				}else {
					System.out.println("No subject");
					break;
				}
			}
			if(stu==null) {
				
				System.out.println("No student");
			}else {
				System.out.println(stu.displaySubject());
			}
			System.out.println("Add subject ?(y/n)");
			choice=sc.nextLine().charAt(0);
		}
		studao.upload();
		subdao.upload();
		

	}

}
