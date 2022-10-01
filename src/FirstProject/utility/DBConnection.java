package FirstProject.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
public static Connection provideConnection() {
		
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/FirstProject";
		
		try {
			conn= DriverManager.getConnection(url,"root","Ajay@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return conn;

}

}
