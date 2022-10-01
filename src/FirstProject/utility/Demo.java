package FirstProject.utility;

import java.sql.Connection;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Connection conn=DBConnection.provideConnection();
		
		
		  System.out.println(conn);

	}

}
