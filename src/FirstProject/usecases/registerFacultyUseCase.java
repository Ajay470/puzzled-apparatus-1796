package FirstProject.usecases;

import java.util.Scanner;

import FirstProject.Dao.CourseDao;
import FirstProject.Dao.CourseDaoImpl;
import FirstProject.Dao.FacultyDao;
import FirstProject.Dao.FacultyDaoImpl;
import FirstProject.bean.Course;
import FirstProject.bean.Faculty;

public class registerFacultyUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter faculty Name:");
		String fname= sc.nextLine();
		
		System.out.println("Enter faculty address:");
		String add= sc.nextLine();
		
		System.out.println("Enter faculty mobile:");
		String mob= sc.nextLine();
		
		System.out.println("Enter faculty email:");
		String mail= sc.nextLine();
		
		System.out.println("Enter faculty username:");
		String username= sc.nextLine();
		
		System.out.println("Enter faculty password:");
		String password= sc.nextLine();
		
		FacultyDao doa=new FacultyDaoImpl();

		
		
		Faculty fac1=new Faculty();

		fac1.setFacultyname(fname);
		fac1.setFacultyaddress(add);
		fac1.setMobile(mob);
		fac1.setEmail(mail);
		fac1.setUsername(username);
		fac1.setPassword(password);

		
		
		
		

		String result=doa.registerFaculty(fac1);
		
		System.out.println(result);

	}

}
