package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.DaywiseUpdateException;
import FirstProject.Exception.ReportException;
import FirstProject.bean.DaywiseUpdate;

public interface DaywiseUpdateDao {
	
	public List<DaywiseUpdate> getDaywiseUpdate()throws DaywiseUpdateException;

}
