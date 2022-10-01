package FirstProject.usecases;

import java.util.List;


import FirstProject.Dao.ReportDao;
import FirstProject.Dao.ReportDaoImpl;
import FirstProject.Exception.ReportException;
import FirstProject.bean.Report;
public class getReportUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReportDao dao = new ReportDaoImpl();
		
		
		try {
		List<Report> students= dao.getReport();
		
		students.forEach(s ->{
			
			System.out.println("Batch Id: "+s.getBatchId());
			System.out.println("Course Name :"+s.getCourseName());
			System.out.println("Faculty Name :"+s.getFacultyName());
			System.out.println("No of Topic Cover :"+s.getCount());
		
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(ReportException se) {
			System.out.println(se.getMessage());
		}

	}

}
