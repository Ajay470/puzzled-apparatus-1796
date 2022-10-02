package FirstProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import FirstProject.Exception.CourseException;
import FirstProject.bean.Course;
import FirstProject.utility.DBConnection;


public class CourseDaoImpl implements CourseDao {

	
	
	@Override
	public String registerCourse(Course course) {
		String message = "Not Inserted..";
	
		
	
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into course(courseName,fee,courseDescription) values(?,?,?)");
			
			
			
			ps.setString(1, course.getCourseName());
			ps.setInt(2, course.getFee());
			ps.setString(3, course.getCourseDescription());
		
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Course Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	
	}
	
	

	@Override
	public List<Course> getAllCourses() throws CourseException {
        List<Course> courseList= new ArrayList<>();
		
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from course");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int r= rs.getInt("courseId");
				String n= rs.getString("courseName");
				int m= rs.getInt("fee");
				String e= rs.getString("courseDescription");
				
				
				
				Course course1=new Course(r, n, m, e);	
				
				courseList.add(course1);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new CourseException(e.getMessage());
		}
		
		
		if(courseList.size() == 0)
			throw new CourseException("No Course found..");
		
		return courseList;
	}



	@Override
	public String updateFee_Course(int CourseId, int Fee) {
		String message = " Fee Not Updated..";

		 try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("UPDATE course SET fee= ? WHERE CourseId=?");
			
			
			
			ps.setInt(1, Fee);
			ps.setInt(2, CourseId);
		
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Fee Updated Sucessfully !";
			
			
			
		} catch (SQLException e) {
			System.out.println("Check Course Id");
			message = e.getMessage();
		}

		return message;
	}



	@Override
	public String updateDesc_Course(int CourseId, String desc) {
		String message = " Description Not Updated..";

		 try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("UPDATE course SET courseDescription= ? WHERE CourseId=?");
			
			
			
			ps.setString(1, desc);
			ps.setInt(2, CourseId);
		
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Description Updated Sucessfully !";
			
			
			
		} catch (SQLException e) {
			System.out.println("Check Course Id");
			message = e.getMessage();
		}

		return message;
	}

	
	
	
	

	

	

	

}
