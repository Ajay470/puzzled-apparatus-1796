package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.BatchException;
import FirstProject.bean.Batch;

public interface BatchDao {
	
    public String registerBatch(Batch batch );
	
	public List<Batch> getAllBatch()throws BatchException;
	
	public String allocateFaculty(int  FacultyId,int BatchId );
	
	public String updateNoOfStudent_Batch(int  batchId,int numberOfStudent );
	
	

}
