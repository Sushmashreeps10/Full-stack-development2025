package Model;

import java.util.Objects;

public class Course {
	private String courseid;
	private String coursename;
	private int credit;
	private String coursetype;
	
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseid, coursename, credit, coursetype);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseid, other.courseid) && Objects.equals(coursename, other.coursename)
				&& credit == other.credit && Objects.equals(coursetype, other.coursetype);
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", credit=" + credit + ", coursetype=" + coursetype
				+ "]";
	}
	public Course(String courseid, String coursename, int credit, String coursetype) {
		this.courseid = courseid;
		this.coursename = coursename;
		this.credit = credit;
		this.coursetype = coursetype;
	}
	public Course() {
	}
	

}
