package FirstProject.Dao;

import FirstProject.Exception.FacultyException;
import FirstProject.bean.Faculty;


public interface LoginDao {
	
	public Faculty  LoginFaculty(String username ,String Password )throws FacultyException;

	public boolean  LoginAdmin(String username ,String Password )throws FacultyException;
}
