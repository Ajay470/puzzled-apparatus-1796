package masai.Dao;

import java.util.List;

import masai.Exception.DaywiseUpdateException;
import masai.Exception.ReportException;
import masai.bean.DaywiseUpdate;
import masai.bean.Report;




public interface ReportDao {
	
	public List<Report> getReport()throws ReportException;

}
