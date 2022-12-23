package masai.Dao;

import java.util.List;

import masai.Exception.CoursePlanException;
import masai.bean.CoursePlan;


public interface CoursePlanDao {
	
    public String registerCoursePlan(CoursePlan courseplan );
	
	public List<CoursePlan> getAllCoursesPlan()throws CoursePlanException;
	
	public String updateTopic_CoursePlan(int  planId,String topic );
	
	public String updateStatus_CoursePlan(int  planId,String status );

}
