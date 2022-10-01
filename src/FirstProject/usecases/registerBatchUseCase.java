package FirstProject.usecases;

import java.util.Scanner;

import FirstProject.Dao.BatchDao;
import FirstProject.Dao.BatchDaoImpl;
import FirstProject.Dao.FacultyDao;
import FirstProject.Dao.FacultyDaoImpl;
import FirstProject.bean.Batch;
import FirstProject.bean.Faculty;

public class registerBatchUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		
	
		
		System.out.println("Enter Course ID :");
		int cid= sc.nextInt();
		
		System.out.println("Enter faculty ID:");
		int fid= sc.nextInt();
		
		System.out.println("Enter numberof Students:");
		int count= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter batch start Date (yyyy-mm-dd)");
		String sdate= sc.nextLine();
		
		System.out.println("Enter Duration");
		String duration= sc.nextLine();
		
		BatchDao doa=new BatchDaoImpl();

		
		
		Batch batch1=new Batch();

		batch1.setCourseId(cid);
		batch1.setFacultyId(fid);
		batch1.setNumberofStudents(count);
		batch1.setBatchstartDate(sdate);
		batch1.setDuration(duration);
		

		String result=doa.registerBatch(batch1);
		
		System.out.println(result);

	}

}
