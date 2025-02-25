package techm1;

import java.util.Objects;

public class Course {
	private String courseid;
	private String coursename1;
	private int credit;
	private String ctype;

	
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename1() {
		return coursename1;
	}
	public void setCoursename1(String coursename1) {
		this.coursename1 = coursename1;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseid, coursename1, credit, ctype);
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
		return Objects.equals(courseid, other.courseid) && Objects.equals(coursename1, other.coursename1)
				&& credit == other.credit && Objects.equals(ctype, other.ctype);
	}
	@Override
	public String toString() {
		return "course [courseid=" + courseid + ", coursename1=" + coursename1 + ", credit=" + credit + ", ctype=" + ctype
				+ "]";
	}
	public Course(String courseid, String coursename1, int credit, String ctype) {
		this.courseid = courseid;
		this.coursename1 = coursename1;
		this.credit = credit;
		this.ctype = ctype;
	}
	public Course() {
	}
	public String getcourseid() {
		// TODO Auto-generated method stub
		return courseid;
	
	}
	public int getcredit() {
		// TODO Auto-generated method stub
		return credit;
	}
	public String getctype() {
		// TODO Auto-generated method stub
		return ctype;
	}
	public String getcoursename1() {
		// TODO Auto-generated method stub
		return coursename1;
	}
	
	
	

}
