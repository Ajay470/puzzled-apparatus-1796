package FirstProject.usecases;

import java.util.Scanner;



import FirstProject.Dao.CourseDao;
import FirstProject.Dao.CourseDaoImpl;
import FirstProject.bean.Course;

public class registerCourseUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Name:");
		String cname= sc.next();
		
		System.out.println("Enter Course Fee:");
		int fee= sc.nextInt();
		
		System.out.println("Enter Course Description:");
		String des= sc.nextLine();
		
		
		
		CourseDao doa=new CourseDaoImpl();

		
		
		Course course1=new Course();

		course1.setCourseName(cname);
		course1.setFee(fee);
		course1.setCourseDescription(des);

		
		
		
		

		String result=doa.registerCourse(course1);
		
		System.out.println(result);

	}

}
