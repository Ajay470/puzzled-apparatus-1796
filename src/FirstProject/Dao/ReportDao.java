package FirstProject.Dao;

import java.util.List;

import FirstProject.Exception.DaywiseUpdateException;
import FirstProject.Exception.ReportException;
import FirstProject.bean.DaywiseUpdate;
import FirstProject.bean.Report;




public interface ReportDao {
	
	public List<Report> getReport()throws ReportException;

}
