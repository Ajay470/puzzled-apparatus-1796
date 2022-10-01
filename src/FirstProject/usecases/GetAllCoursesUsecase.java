package FirstProject.usecases;

import java.util.List;

import FirstProject.Dao.CourseDao;
import FirstProject.Dao.CourseDaoImpl;
import FirstProject.Exception.CourseException;
import FirstProject.bean.Course;



public class GetAllCoursesUsecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
CourseDao dao = new CourseDaoImpl();
//CourseDao doa = new CourseDaoImpl();
		
		try {
		List<Course> students= dao.getAllCourses();
		
		students.forEach(s ->{
			
			System.out.println("Student CourseId: "+s.getCourseId());
			System.out.println("Student Name :"+s.getCourseName());
			System.out.println("Student email: "+s.getFee());
			System.out.println("Student Description: "+s.getCourseDescription());
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(CourseException se) {
			System.out.println(se.getMessage());
		}
		

	}

}
