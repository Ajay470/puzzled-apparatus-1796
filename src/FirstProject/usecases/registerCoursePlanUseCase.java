package FirstProject.usecases;

import java.util.Scanner;

import FirstProject.Dao.CourseDao;
import FirstProject.Dao.CourseDaoImpl;
import FirstProject.Dao.CoursePlanDao;
import FirstProject.Dao.CoursePlanDaoImpl;
import FirstProject.bean.Course;
import FirstProject.bean.CoursePlan;

public class registerCoursePlanUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Batch Id:");
		int batchId= sc.nextInt();
		
		System.out.println("Enter day number:");
		int dayNo= sc.nextInt();
		sc.nextLine();

		
		System.out.println("Enter Topic:");
		String topic= sc.nextLine();;
		
		System.out.println("Enter Status:");
		String status= sc.nextLine();
		
		
		
		CoursePlanDao doa=new CoursePlanDaoImpl();

		
		
		CoursePlan coursePlan1=new CoursePlan();

		coursePlan1.setBatchId(batchId);
		coursePlan1.setDaynumber(dayNo);
		coursePlan1.setTopic(topic);
		coursePlan1.setStatus(status);

		
		
		
		

		String result=doa.registerCoursePlan(coursePlan1);
		
		System.out.println(result);

	}

}
