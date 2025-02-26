package Model;

import java.util.Objects;

public class Course {
	private String cid;
	private String cname;
	private int credits;
	private String ctype;
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, credits, ctype);
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
		return Objects.equals(cid, other.cid) && Objects.equals(cname, other.cname) && credits == other.credits
				&& Objects.equals(ctype, other.ctype);
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", credits=" + credits + ", ctype=" + ctype + "]";
	}
	public Course(String cid, String cname, int credits, String ctype) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.credits = credits;
		this.ctype = ctype;
	}
	public String getcoursename1() {
		// TODO Auto-generated method stub
		return null;
	}

}
