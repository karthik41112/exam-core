package examSeating.controller;
import java.util.*;


import examSeating.dao.DepartmentDao;
import examSeating.dao.SubjectDao;
import examSeating.models.*;
public class subjectController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SubjectDao sdao=new SubjectDao();
		DepartmentDao ddao=new DepartmentDao();
		
		sdao.display();
		ddao.display();
		
		System.out.println("create subject ?(y/n)");
		char choice=sc.nextLine().charAt(0);
		while(choice=='y') {
			
			System.out.print("Enter  id :");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter sub code :");
			String code=(sc.nextLine());
			System.out.print("Enter name :");
			String name=(sc.nextLine());
			System.out.print("Enter Department  :");
			Department dept=ddao.getDepartment(sc.nextLine());
			if(dept!=null) {
				Subject s=new Subject(id,code,name,dept);
				sdao.createSubject(s);
			}else {
				System.out.println("NO dept");
			}
			System.out.println("create subject ?(y/n)");
			choice=sc.nextLine().charAt(0);			
		}
		sdao.upload();

	}

}
