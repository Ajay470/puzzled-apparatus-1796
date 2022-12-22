package masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import masai.Exception.ReportException;
import masai.bean.Report;
import masai.utility.DBConnection;

public class ReportDaoImpl implements ReportDao {

//	Get all the Report of all the curriculum and activities . 
	@Override
	public List<Report> getReport() throws ReportException {
           List<Report> ReportList= new ArrayList<>();
		
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select c.batchId,a.coursename,b.facultyname,count(d.topic)\r\n"
					+ "from course as a INNER JOIN batch as c\r\n"
					+ "ON a.courseId =c.CourseId \r\n"
					+ "INNER JOIN Faculty as b\r\n"
					+ "ON c.facultyId =b.facultyId\r\n"
					+ "INNER JOIN coursePlan as d \r\n"
					+ "ON c.batchId =d.batchId group by d.batchId ;");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int a= rs.getInt("batchId");
				String b= rs.getString("coursename");
				String c= rs.getString("facultyname");
				int d= rs.getInt("count(d.topic)");
				
				
				
				
				Report rep1=new Report(a,b,c,d);	
				
				ReportList.add(rep1);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new ReportException(e.getMessage());
		}
		
		
		if(ReportList.size() == 0)
			throw new ReportException("No Record found..");
		
		return ReportList;
	}
	

	


}
