package FirstProject.usecases;

import java.util.Scanner;

import FirstProject.Dao.BatchDao;
import FirstProject.Dao.BatchDaoImpl;
import FirstProject.bean.Batch;

public class allocateFacultyUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		
	

		System.out.println("Enter faculty ID:");
		int fid= sc.nextInt();
		
		System.out.println("Enter Batch Id:");
		int bid= sc.nextInt();
		sc.nextLine();
		
		
		
		BatchDao doa=new BatchDaoImpl();


		String result=doa.allocateFaculty(fid,bid);
		
		System.out.println(result);

	}

}
