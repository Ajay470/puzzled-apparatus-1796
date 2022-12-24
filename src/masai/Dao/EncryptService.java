package masai.Dao;

import masai.bean.Faculty;

public interface EncryptService {
	
	
	public Faculty DecryptPassword(Faculty faculty);
	
	public Faculty EncryptPassword(Faculty faculty);

}
