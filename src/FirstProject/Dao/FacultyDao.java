package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.FacultyException;
import FirstProject.bean.Faculty;

public interface FacultyDao {
	
    public String registerFaculty(Faculty faculty );
	
	public List<Faculty> getAllFaculty()throws FacultyException;

}
