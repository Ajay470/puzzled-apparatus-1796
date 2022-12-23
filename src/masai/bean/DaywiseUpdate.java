package masai.bean;

public class DaywiseUpdate {
	
	private int batchId;
	private int daynumber;
	private String coursename;
	private String topic;
	private String facultyname;
	
	public DaywiseUpdate(int batchId, int daynumber, String coursename, String topic, String facultyname) {
		super();
		this.batchId = batchId;
		this.daynumber = daynumber;
		this.coursename = coursename;
		this.topic = topic;
		this.facultyname = facultyname;
	}

	public DaywiseUpdate() {
		super();
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public int getDaynumber() {
		return daynumber;
	}

	public void setDaynumber(int daynumber) {
		this.daynumber = daynumber;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	@Override
	public String toString() {
		return "DaywiseUpdate [batchId=" + batchId + ", daynumber=" + daynumber + ", coursename=" + coursename
				+ ", topic=" + topic + ", facultyname=" + facultyname + "]";
	}
	
	
	

}
