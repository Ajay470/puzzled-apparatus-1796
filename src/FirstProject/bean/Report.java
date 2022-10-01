package FirstProject.bean;

public class Report {
	
	private int BatchId;
	private String CourseName;
	private String FacultyName;
	private int Count;
	
	public Report(int batchId, String courseName, String facultyName, int count) {
		super();
		BatchId = batchId;
		CourseName = courseName;
		FacultyName = facultyName;
		Count = count;
	}
	public Report() {
		super();
	}
	public int getBatchId() {
		return BatchId;
	}
	public void setBatchId(int batchId) {
		BatchId = batchId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getFacultyName() {
		return FacultyName;
	}
	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	@Override
	public String toString() {
		return "Report [BatchId=" + BatchId + ", CourseName=" + CourseName + ", FacultyName=" + FacultyName + ", Count="
				+ Count + "]";
	}

	
	
	
	

}
