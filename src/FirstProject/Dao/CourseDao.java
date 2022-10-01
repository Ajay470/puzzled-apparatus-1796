package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.CourseException;
import FirstProject.bean.Course;

public interface CourseDao {
	
	public String registerCourse(Course course );
	
	public List<Course> getAllCourses()throws CourseException;
	
	public String updateFee_Course(int  CourseId,int Fee );
	
	public String updateDesc_Course(int  CourseId,String desc );
	

}
