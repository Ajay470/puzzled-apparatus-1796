package masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import masai.Exception.BatchException;
import masai.Exception.CourseException;
import masai.bean.Batch;
import masai.bean.Course;
import masai.utility.DBConnection;

public class BatchDaoImpl implements BatchDao {

	
//	Register new batch function.
	@Override
	public String registerBatch(Batch batch) {
         String message = "Not Inserted..";
	
		
	
		
		 try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into batch(courseId,facultyId,numberofStudents,batchstartDate,duration ) values(?,?,?,?,?)");
			
			
			ps.setInt(1, batch.getCourseId());
			ps.setInt(2, batch.getFacultyId());
			ps.setInt(3, batch.getNumberofStudents());
			
			ps.setString(4, batch.getBatchstartDate());
			ps.setString(5, batch.getDuration());
		
			
		
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Batch Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

//	get all the list of batch in org.
	@Override
	public List<Batch> getAllBatch() throws BatchException {
        List<Batch> BatchList= new ArrayList<>();
		
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from batch");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int a= rs.getInt("batchId");
				int b= rs.getInt("courseId");
				int c= rs.getInt("facultyId");
				int d= rs.getInt("numberofStudents");
				String e= rs.getString("batchstartDate");
				String f= rs.getString("duration");
				
				
				
				Batch batch1=new Batch(a,b,c,d,e,f);	
				
				BatchList.add(batch1);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new BatchException(e.getMessage());
		}
		
		
		if(BatchList.size() == 0)
			throw new BatchException("No Course found..");
		
		return BatchList;
	}

//	allocate faculty to batch
	@Override
	public String allocateFaculty(int FacultyId,int batchid) {
		String message = " Faculty Not Inserted..";
		
		 try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("UPDATE batch SET facultyid= ? WHERE batchid=?");
			
			
			
			ps.setInt(1, FacultyId);
			ps.setInt(2, batchid);
		
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Faculty Allocate Sucessfully !";
			
			
			
		} catch (SQLException e) {
			System.out.println("Check Faculty Id");
			message = e.getMessage();
		}

		return message;
	}

//	Assign no of student in particular batch
	@Override
	public String updateNoOfStudent_Batch(int batchId, int numberOfStudent) {
		String message = " Student Count not Updated..";
		
		 try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("UPDATE batch SET numberofStudents= ? WHERE batchid=?");
			
			
			
			ps.setInt(1, numberOfStudent);
			ps.setInt(2, batchId);
		
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Student number Updated Sucessfully !";
			
			
			
		} catch (SQLException e) {
			System.out.println("Check Batch  Id");
			message = e.getMessage();
		}

		return message;
	}

}
