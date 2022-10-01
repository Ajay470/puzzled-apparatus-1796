package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.CoursePlanException;
import FirstProject.bean.CoursePlan;


public interface CoursePlanDao {
	
    public String registerCoursePlan(CoursePlan courseplan );
	
	public List<CoursePlan> getAllCoursesPlan()throws CoursePlanException;

}
