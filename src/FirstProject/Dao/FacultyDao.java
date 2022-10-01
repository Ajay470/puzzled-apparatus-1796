package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.FacultyException;
import FirstProject.bean.Faculty;

public interface FacultyDao {
	
    public String registerFaculty(Faculty faculty );
	
	public List<Faculty> getAllFaculty()throws FacultyException;
	
	public String updateMobile_Faculty(int facultyid,String mob );
	
	public String updateAddress_Faculty(int facultyid,String add );
	
	public String updatePassword_Faculty(int facultyid,String oldpassword,String newpassword )throws FacultyException;

}
