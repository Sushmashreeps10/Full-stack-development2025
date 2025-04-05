package Model;

import java.util.Objects;

public class Enrollment {
	private int sid;
	private String courseid;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseid, sid);
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
		return Objects.equals(courseid, other.courseid) && Objects.equals(sid, other.sid);
	}
	public Enrollment(int sid, String courseid) {
		super();
		this.sid = sid;
		this.courseid = courseid;
	}
	
	public Enrollment() {
		super();
	}
	
	

	
	
}
