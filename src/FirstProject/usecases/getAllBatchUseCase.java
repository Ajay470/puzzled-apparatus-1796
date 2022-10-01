package FirstProject.usecases;

import java.util.List;

import FirstProject.Dao.BatchDao;
import FirstProject.Dao.BatchDaoImpl;
import FirstProject.Dao.CourseDao;
import FirstProject.Dao.CourseDaoImpl;
import FirstProject.Exception.BatchException;
import FirstProject.Exception.CourseException;
import FirstProject.bean.Batch;
import FirstProject.bean.Course;

public class getAllBatchUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       BatchDao dao = new BatchDaoImpl();
		
				
				try {
				List<Batch> students= dao.getAllBatch();
				
				students.forEach(s ->{
					
					System.out.println("BatchId Id: "+s.getBatchId());
					System.out.println("Course Id :"+s.getCourseId());
					System.out.println("Faculty Id: "+s.getFacultyId());
					System.out.println("Number Of Student: "+s.getNumberofStudents());
					System.out.println("Batch Start Date: "+s.getBatchstartDate());
					System.out.println("Duration: "+s.getDuration());
					
					
					System.out.println("=======================");
				});
				
				
				
				
				}catch(BatchException se) {
					System.out.println(se.getMessage());
				}
				


	}

}
