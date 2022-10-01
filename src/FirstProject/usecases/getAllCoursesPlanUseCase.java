package FirstProject.usecases;

import java.util.List;
import FirstProject.Dao.CoursePlanDao;
import FirstProject.Dao.CoursePlanDaoImpl;
import FirstProject.Exception.CoursePlanException;
import FirstProject.bean.CoursePlan;


public class getAllCoursesPlanUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        CoursePlanDao dao = new CoursePlanDaoImpl();

		
		try {
		List<CoursePlan> students= dao.getAllCoursesPlan();
		
		students.forEach(s ->{
			
			System.out.println("Course Id: "+s.getPlanId());
			System.out.println("Batch Id :"+s.getBatchId());
			System.out.println("Day: "+s.getDaynumber());
			System.out.println("Topic: "+s.getTopic());
			System.out.println("Status: "+s.getStatus());
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(CoursePlanException se) {
			System.out.println(se.getMessage());
		}
		

	}

}
