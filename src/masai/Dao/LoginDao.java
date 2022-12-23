package masai.Dao;

import masai.Exception.FacultyException;
import masai.bean.Faculty;


public interface LoginDao {
	
	public Faculty  LoginFaculty(String username ,String Password )throws FacultyException;

	public boolean  LoginAdmin(String username ,String Password )throws FacultyException;
}
