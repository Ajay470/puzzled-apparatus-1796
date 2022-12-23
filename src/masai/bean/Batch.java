package masai.bean;

public class Batch {
	
	    private int batchId;
		private int courseId;
		private int facultyId;
		private int numberofStudents;
		private String batchstartDate;
		private String duration;
		
		public Batch(int batchId, int courseId, int facultyId, int numberofStudents, String batchstartDate,
				String duration) {
			super();
			this.batchId = batchId;
			this.courseId = courseId;
			this.facultyId = facultyId;
			this.numberofStudents = numberofStudents;
			this.batchstartDate = batchstartDate;
			this.duration = duration;
		}

		public Batch() {
			// TODO Auto-generated constructor stub
		}

		public int getBatchId() {
			return batchId;
		}

		public void setBatchId(int batchId) {
			this.batchId = batchId;
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public int getFacultyId() {
			return facultyId;
		}

		public void setFacultyId(int facultyId) {
			this.facultyId = facultyId;
		}

		public int getNumberofStudents() {
			return numberofStudents;
		}

		public void setNumberofStudents(int numberofStudents) {
			this.numberofStudents = numberofStudents;
		}

		public String getBatchstartDate() {
			return batchstartDate;
		}

		public void setBatchstartDate(String batchstartDate) {
			this.batchstartDate = batchstartDate;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		@Override
		public String toString() {
			return "Batch [batchId=" + batchId + ", courseId=" + courseId + ", facultyId=" + facultyId
					+ ", numberofStudents=" + numberofStudents + ", batchstartDate=" + batchstartDate + ", duration="
					+ duration + "]";
		} 
		
		

}
