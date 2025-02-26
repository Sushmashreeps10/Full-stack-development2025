package Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DataSource.MysqlDBConnection;
import Model.Course;

public class CourseRepository {
	private MysqlDBConnection connection;
	private String getcourseid;
	private String getcoursename;
	
	public CourseRepository(MysqlDBConnection connection) {
		super();
		this.connection= connection;
	}

	public MysqlDBConnection getConnection() {
		return connection;
	}

	public void setConnection(MysqlDBConnection connection) {
		this.connection = connection;
	}
	
	public int insertCourse(Course c){
		int r=0;
		try {
		String sql="insert into course values(?,?,?,?)";
		
		PreparedStatement ps=connection.getConnection().prepareStatement(sql);
		ps.setString(1, c.getCid());
		ps.setString(2, c.getCname());
		ps.setInt(3, c.getCredits());
		ps.setString(4,c.getCtype());
		
		 r=ps.executeUpdate();
		
		}catch(Exception e) {}
		return r;
	}
		
	public List<Course> fetchAllCourses() {
		List<Course> list=new ArrayList<Course>();
		Course c;
		try {
		String sql="select * from course";	
		Statement st=connection.getConnection().createStatement();
		ResultSet set=st.executeQuery(sql);
		while(set.next()) {
			String courseid=set.getString(1);
			String coursename=set.getString(2);
			int credit=set.getInt(3);
			String ctype=set.getString(4);
			c=new Course(courseid,coursename,credit,ctype);
			list.add(c);
		}
		}catch(Exception e) {}
		return list;
	}
	public int updateCourse(Course c, String courseid) {
		int r=0;
		try {
		String sql="update course set address=?, year=? where sid=?";	
		PreparedStatement ps=connection.getConnection().prepareStatement(sql);
		ps.setString(1, getcourseid);
		ps.setString(2,getcoursename );
		ps.setInt(3, c.getCredits());
		ps.setString(4, c.getCtype());
		r=ps.executeUpdate();
		}catch(Exception e) {}
		return r;
	}
	public int deleteCouse(String id) {
		int r=0;
		try {
			String sql="delete from course where courseid=?";	
			PreparedStatement ps=connection.getConnection().prepareStatement(sql);
			ps.setString(1,id);
			r=ps.executeUpdate();
		}catch(Exception e) {}
		return r;
	}

}