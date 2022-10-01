package FirstProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FirstProject.Exception.CourseException;
import FirstProject.Exception.CoursePlanException;
import FirstProject.bean.Course;
import FirstProject.bean.CoursePlan;
import FirstProject.utility.DBConnection;

public class CoursePlanDaoImpl implements CoursePlanDao {

	@Override
	public String registerCoursePlan(CoursePlan courseplan) {
        String message = "CoursePlan Not Inserted..";
	
		
	
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into coursePlan(batchId,daynumber,topic,status) values(?,?,?,?)");
			
			
			ps.setInt(1, courseplan.getBatchId());
			ps.setInt(2, courseplan.getDaynumber());
			ps.setString(3, courseplan.getTopic());
			ps.setString(4, courseplan.getStatus());
		
		
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "CoursePlan Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public List<CoursePlan> getAllCoursesPlan() throws CoursePlanException {
         List<CoursePlan> coursePlanList= new ArrayList<>();
		
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from coursePlan");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int a= rs.getInt("planId");
				int b= rs.getInt("batchId");
				int c= rs.getInt("daynumber");
				String d= rs.getString("topic");
				String e= rs.getString("status");
				
				
				
				CoursePlan coursePlan1=new CoursePlan(a,b,c,d,e);	
				
				coursePlanList.add(coursePlan1);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new CoursePlanException(e.getMessage());
		}
		
		
		if(coursePlanList.size() == 0)
			throw new CoursePlanException("No CoursePlan found..");
		
		return coursePlanList;
	}

}
