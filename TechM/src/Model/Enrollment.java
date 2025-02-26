package Model;

import java.util.Objects;

public class Enrollment {
	private String Studentid;
	private String courseid;
	public String getStudentid() {
		return Studentid;
	}
	public void setStudentid(String studentid) {
		Studentid = studentid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Studentid, courseid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		return Objects.equals(Studentid, other.Studentid) && Objects.equals(courseid, other.courseid);
	}
	@Override
	public String toString() {
		return "Enrollment [Studentid=" + Studentid + ", courseid=" + courseid + "]";
	}
	public Enrollment(String studentid, String courseid) {
		super();
		Studentid = studentid;
		this.courseid = courseid;
	}

}
