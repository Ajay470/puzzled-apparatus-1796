package masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import masai.Exception.FacultyException;
import masai.bean.Faculty;
import masai.utility.DBConnection;

public class LoginDaoImpl implements LoginDao {

	@Override
	public Faculty LoginFaculty(String username, String Password) throws FacultyException {
		
		Faculty faculty=null;
		
		try(Connection conn= DBConnection.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from Faculty where username=? AND password=?");

			ps.setString(1, username);
			ps.setString(2, Password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				int a= rs.getInt("facultyid");
				String b= rs.getString("facultyname");
				String c= rs.getString("facultyaddress");
				String d= rs.getString("mobile");
				String e= rs.getString("email");
				String f= rs.getString("username");
				String g= rs.getString("password");
				
				faculty=new Faculty(a,b,c,d,e,f,g);
			}else {
				throw new FacultyException("Invalid username or password");
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new FacultyException(e.getMessage());
		}
		
		return faculty;
	}

	@Override
	public boolean LoginAdmin(String username, String Password) throws FacultyException {
		boolean admin= false;
		
		if(username.equals("admin") && Password.equals("admin")) {
			
			admin=true;
			
		}else {
			throw new FacultyException("Invalid username or password");
		}
		
//		
//		try(Connection conn= DBConnection.provideConnection()){
//			PreparedStatement ps= conn.prepareStatement("select * from admin where username=? AND password=?");
//
//			ps.setString(1, username);
//			ps.setString(2, Password);
//			
//			ResultSet rs=ps.executeQuery();
//			
//			if(rs.next()) {
//				
//				
//			}else {
//				throw new FacultyException("Invalid username or password");
//			}
//			
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//			throw new FacultyException(e.getMessage());
//		}
		
		return admin;
	}

	
	

	

	
}
