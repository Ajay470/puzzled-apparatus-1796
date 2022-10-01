package FirstProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FirstProject.Exception.CourseException;
import FirstProject.Exception.FacultyException;
import FirstProject.bean.Course;
import FirstProject.bean.Faculty;
import FirstProject.utility.DBConnection;

public class FacultyDaoImpl implements FacultyDao{

	@Override
	public String registerFaculty(Faculty faculty) {
       String message = "Not Inserted..";
	
	
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into Faculty(facultyname,facultyaddress,mobile,email,username,password) values(?,?,?,?,?,?)");
			
			
			
			ps.setString(1, faculty.getFacultyname());
			ps.setString(2, faculty.getFacultyaddress());
			ps.setString(3, faculty.getMobile());
			ps.setString(4, faculty.getEmail());
			ps.setString(5, faculty.getUsername());
			ps.setString(6, faculty.getPassword());
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Faculty Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public List<Faculty> getAllFaculty() throws FacultyException {
List<Faculty> FacultyList= new ArrayList<>();
		
		
		try(Connection conn= DBConnection.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Faculty");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int a= rs.getInt("facultyid");
				String b= rs.getString("facultyname");
				String c= rs.getString("facultyaddress");
				String d= rs.getString("mobile");
				String e= rs.getString("email");
				String f= rs.getString("username");
				String g= rs.getString("password");
				
				
				
				Faculty fac1=new Faculty(a,b,c,d,e,f,g);	
				
				FacultyList.add(fac1);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new FacultyException(e.getMessage());
		}
		
		
		if(FacultyList.size() == 0)
			throw new FacultyException("No Faculty found..");
		
		return FacultyList;
	}

}
