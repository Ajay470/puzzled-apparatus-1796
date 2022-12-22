package masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import masai.Exception.DaywiseUpdateException;
import masai.bean.DaywiseUpdate;
import masai.utility.DBConnection;

public class DaywiseUpdateDaoImpl implements DaywiseUpdateDao {

//	get all the list of CoursePlan daywise/ Time table of courses.
	@Override
	public List<DaywiseUpdate> getDaywiseUpdate() throws DaywiseUpdateException {
         List<DaywiseUpdate> DaywiseUpdateList= new ArrayList<>();
		
		
		 try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select c.batchId,d.daynumber,a.coursename,d.topic,b.facultyname\r\n"
					+ "from course as a INNER JOIN batch as c\r\n"
					+ "ON a.courseId =c.CourseId \r\n"
					+ "INNER JOIN Faculty as b\r\n"
					+ "ON c.facultyId =b.facultyId\r\n"
					+ "INNER JOIN coursePlan as d \r\n"
					+ "ON c.batchId =d.batchId  order by c.batchId,d.daynumber;");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int a= rs.getInt("batchId");
				int b= rs.getInt("daynumber");
				
				String c= rs.getString("coursename");
				String d= rs.getString("topic");
				String e= rs.getString("facultyname");
				
				
				
				
				DaywiseUpdate rep1=new DaywiseUpdate(a,b,c,d,e);	
				
				DaywiseUpdateList.add(rep1);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new DaywiseUpdateException(e.getMessage());
		}
		
		
		if(DaywiseUpdateList.size() == 0)
			throw new DaywiseUpdateException("No Record found..");
		
		return DaywiseUpdateList;
	}

}
