package masai.Dao;

import java.util.List;

import masai.Exception.DaywiseUpdateException;
import masai.Exception.ReportException;
import masai.bean.DaywiseUpdate;

public interface DaywiseUpdateDao {
	
	public List<DaywiseUpdate> getDaywiseUpdate()throws DaywiseUpdateException;

}
