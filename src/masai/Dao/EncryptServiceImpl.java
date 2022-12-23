package masai.Dao;

import java.util.Base64;
import java.util.Base64.Decoder;


import masai.bean.Faculty;


public class EncryptServiceImpl implements EncryptService {

	@Override
	public Faculty EncryptPassword(Faculty faculty) {
		

		java.util.Base64.Encoder encoder = Base64.getEncoder();
        String originalString = faculty.getPassword();
        String encodedString = encoder.encodeToString(originalString.getBytes());
        faculty.setPassword(encodedString);


		return faculty;
	}
	
	@Override
	public Faculty DecryptPassword(Faculty faculty) {
		

        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(faculty.getPassword());


        faculty.setPassword(new String(bytes));
		return faculty;
	}

}
