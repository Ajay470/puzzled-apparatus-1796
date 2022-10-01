package FirstProject.usecases;

import java.util.List;

import FirstProject.Dao.CourseDao;
import FirstProject.Dao.CourseDaoImpl;
import FirstProject.Dao.FacultyDao;
import FirstProject.Dao.FacultyDaoImpl;
import FirstProject.Exception.CourseException;
import FirstProject.Exception.FacultyException;
import FirstProject.bean.Course;
import FirstProject.bean.Faculty;

public class getAllFacultyUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacultyDao dao = new FacultyDaoImpl();
	
				
				try {
				List<Faculty> students= dao.getAllFaculty();
				
				students.forEach(s ->{
					
					System.out.println("Faculty Id: "+s.getFacultyid());
					System.out.println("Faculty Name :"+s.getFacultyname());
					System.out.println("Faculty Address :"+s.getFacultyaddress());
					System.out.println("Faculty Mobile :"+s.getMobile());
					System.out.println("Faculty Email :"+s.getEmail());
					System.out.println("Faculty Username: "+s.getUsername());
					System.out.println("Faculty Password: "+s.getPassword());
					
					System.out.println("=======================");
				});
				
				
				
				
				}catch(FacultyException se) {
					System.out.println(se.getMessage());
				}
				

			}

	}


