package FirstProject.usecases;

import java.util.*;


import FirstProject.Dao.*;

import FirstProject.Exception.*;
import FirstProject.bean.*;

public class Main {
	
	

	//******************************************************************//
	//***************************Course*********************************//
	//******************************************************************//
	
	          //**********registerCourseUseCase*********//
	
	public static void registerCourseUseCase() {
		
		 Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Course Name:");
			String cname= sc.next();
			
			System.out.println("Enter Course Fee:");
			int fee= sc.nextInt();
			
			System.out.println("Enter Course Description:");
			String des= sc.nextLine();
			
			
			
			CourseDao doa=new CourseDaoImpl();

			Course course1=new Course();

			course1.setCourseName(cname);
			course1.setFee(fee);
			course1.setCourseDescription(des);

			
			String result=doa.registerCourse(course1);
			
			System.out.println(result);
	}
	
	
	
               //**********GetAllCoursesUsecase*********//
	
	
	public static void GetAllCoursesUsecase() {
        CourseDao dao = new CourseDaoImpl();

		
		try {
		List<Course> students= dao.getAllCourses();
		
		students.forEach(s ->{
			
			System.out.println("Student CourseId: "+s.getCourseId());
			System.out.println("Student Name :"+s.getCourseName());
			System.out.println("Student email: "+s.getFee());
			System.out.println("Student Description: "+s.getCourseDescription());
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(CourseException se) {
			System.out.println(se.getMessage());
		}
		
	}
	
	            //**********GetAllCoursesUsecase*********//
	
	
	public static void updateFee_CourseUseCase() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Id :");
		int cid= sc.nextInt();
		
		System.out.println("Enter Fee:");
		int fee= sc.nextInt();
		sc.nextLine();
		
		
		
		CourseDao doa=new CourseDaoImpl();


		String result=doa.updateFee_Course(cid,fee);
		
		System.out.println(result);
	}
	
	
	         //**********updateDesc_CourseUseCase*********//
	
	public static void updateDesc_CourseUseCase() {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Id :");
		int cid= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Description:");
		String desc= sc.nextLine();
	
		
		CourseDao doa=new CourseDaoImpl();


		String result=doa.updateDesc_Course(cid,desc);
		
		System.out.println(result);
		
	}
	
	
	
	    //******************************************************************//
		//***************************Faculty*********************************//
		//******************************************************************//
	
	            //**********registerFacultyUseCase*********//
	
	public static void registerFacultyUseCase() {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter faculty Name:");
		String fname= sc.nextLine();
		
		System.out.println("Enter faculty address:");
		String add= sc.nextLine();
		
		System.out.println("Enter faculty mobile:");
		String mob= sc.nextLine();
		
		System.out.println("Enter faculty email:");
		String mail= sc.nextLine();
		
		System.out.println("Enter faculty username:");
		String username= sc.nextLine();
		
		System.out.println("Enter faculty password:");
		String password= sc.nextLine();
		
		FacultyDao doa=new FacultyDaoImpl();

		Faculty fac1=new Faculty();

		fac1.setFacultyname(fname);
		fac1.setFacultyaddress(add);
		fac1.setMobile(mob);
		fac1.setEmail(mail);
		fac1.setUsername(username);
		fac1.setPassword(password);

		
	
		String result=doa.registerFaculty(fac1);
		
		System.out.println(result);
		
	}
	
    //**********getAllFacultyUseCase*********//
	
	public static void getAllFacultyUseCase() {
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
	
               	//**********updateMobile_FacultyUseCase*********//
	
	public static void updateMobile_FacultyUseCase() {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Faculty Id :");
		int fid= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Mobile Number:");
		String mob= sc.nextLine();
	
		
		FacultyDao doa=new FacultyDaoImpl();


		String result=doa.updateMobile_Faculty(fid,mob);
		
		System.out.println(result); 
	}
	
	
	           //**********updateAddress_FacultyUseCase*********//
	
    public static void updateAddress_FacultyUseCase() {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Faculty Id :");
		int fid= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address:");
		String add= sc.nextLine();
	
		
		FacultyDao doa=new FacultyDaoImpl();


		String result=doa.updateAddress_Faculty(fid,add);
		
		System.out.println(result); 
	}
	
    //**********updateAddress_FacultyUseCase*********//
    
//    public static void updatePassword_FacultyUseCase() {
//    	
//    	
//    	
//    }
    
    
    
  //******************************************************************//
  		//***************************Batch*********************************//
  		//******************************************************************//
  	
  	            //**********registerBatchUseCase*********//
    
    public static void registerBatchUseCase() {
    	
        Scanner sc= new Scanner(System.in);
		
	
		
		System.out.println("Enter Course ID :");
		int cid= sc.nextInt();
		
		System.out.println("Enter faculty ID:");
		int fid= sc.nextInt();
		
		System.out.println("Enter number of Students:");
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
    
    
                    //**********getAllBatchUseCase*********//
    
    
    public static void getAllBatchUseCase() {
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
	
	
                    //**********allocateFacultyUseCase*********//
    
    
    public static void allocateFacultyUseCase() {
    	
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
    
    
 //**********updateNoOfStudent_Batch*********//
    
    
    public static void updateNoOfStudent_BatchUseCase() {
    	
        Scanner sc= new Scanner(System.in);
		
    	
		System.out.println("Enter Batch Id:");
		int batchId= sc.nextInt();
		System.out.println("Enter No Of Student:");
		int Number= sc.nextInt();
		sc.nextLine();
		
		
		
		BatchDao doa=new BatchDaoImpl();


		String result=doa.updateNoOfStudent_Batch(batchId,Number);
		
		System.out.println(result);
    	
    	
    }
    
    
    
    
    //******************************************************************//
		//***************************CoursePlan*********************************//
		//******************************************************************//
	
	            //**********registerCoursePlanUseCase*********//
    
	
    public static void registerCoursePlanUseCase() {
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
    
             //**********getAllCoursesPlanUseCase*********//
    
	
    public static void getAllCoursesPlanUseCase() {
    	
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
    
          //**********updateTopic_CoursePlanUseCase*********//
    
	
    public static void updateTopic_CoursePlanUseCase() {
    	
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Plan Id :");
		int planId= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Topic:");
		String topic= sc.nextLine();
	
		
		CoursePlanDao doa=new CoursePlanDaoImpl();


		String result=doa.updateTopic_CoursePlan(planId,topic);
		
		System.out.println(result); 
    	
    	
    }
    
    
//**********updateTopic_CoursePlanUseCase*********//
    
	
    public static void updateStatus_CoursePlanUseCase() {
    	
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Plan Id :");
		int planId= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Status:");
		String status= sc.nextLine();
	
		
		CoursePlanDao doa=new CoursePlanDaoImpl();


		String result=doa.updateStatus_CoursePlan(planId,status);
		
		System.out.println(result); 
    }
    	
    
    
    
  //******************************************************************//
  		//***************************DaywiseUpdate*********************************//
  		//******************************************************************//
  	
  	               //**********GetDaywiseUpdateUseCase*********//
    
    public static void GetDaywiseUpdateUseCase() {
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
    
    
    
    
    
         //******************************************************************//
  		//***************************Report*********************************//
  		//******************************************************************//
  	
  	              //**********getReportUseCase*********//
    
    public static void getReportUseCase() {
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


    //******************************************************************//
		//***************************Main*********************************//
		//******************************************************************//
    //******************************************************************//
		//***************************Main*********************************//
		//******************************************************************//
    //******************************************************************//
		//***************************Main*********************************//
		//******************************************************************//


    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Main.registerCourseUseCase();
//		Main.GetAllCoursesUsecase();
//		Main.updateFee_CourseUseCase();
//		Main.updateDesc_CourseUseCase();
//		Main.registerFacultyUseCase();
//		Main.getAllFacultyUseCase();
//		Main.updateMobile_FacultyUseCase();
//		Main.updateAddress_FacultyUseCase();
//		Main.registerBatchUseCase();
//		Main.getAllBatchUseCase();
//		Main.allocateFacultyUseCase();
//		Main.updateNoOfStudent_BatchUseCase();
//		Main.registerCoursePlanUseCase();
//		Main.getAllCoursesPlanUseCase();
//		Main.updateTopic_CoursePlanUseCase();
//		Main.updateStatus_CoursePlanUseCase();
//		Main.GetDaywiseUpdateUseCase();
//		Main.getReportUseCase();
		
		
		
		

	}

}
