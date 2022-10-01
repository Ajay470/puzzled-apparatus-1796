package FirstProject.usecases;

import java.util.List;

import FirstProject.Dao.DaywiseUpdateDao;
import FirstProject.Dao.DaywiseUpdateDaoImpl;
import FirstProject.Exception.DaywiseUpdateException;
import FirstProject.bean.DaywiseUpdate;



public class GetDaywiseUpdateUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaywiseUpdateDao dao = new DaywiseUpdateDaoImpl();
		
		
		try {
		List<DaywiseUpdate> students= dao.getDaywiseUpdate();
		
		students.forEach(s ->{
			
			System.out.println("Batch Id: "+s.getBatchId());
			System.out.println("Day :"+s.getDaynumber());
			System.out.println("Course Name :"+s.getCoursename());
			System.out.println("Topic :"+s.getTopic());
			System.out.println("Faculty Name :"+s.getFacultyname());
		
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(DaywiseUpdateException se) {
			System.out.println(se.getMessage());
		}

	}

}
