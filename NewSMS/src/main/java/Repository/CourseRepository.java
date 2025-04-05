package Repository;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import DataSource.MySqlDBConnection;
import Model.Course;

// Datasource   --  Configuration
// JDBC calls 

// this violates SOLID principle
public class CourseRepository {
	// get the datasourse object
	// Injecting/wiring an object
	// @autowire
	private MySqlDBConnection connection;
	// alt shift s

	public CourseRepository(MySqlDBConnection connection) {
		super();
		this.connection = connection;
	}

	public MySqlDBConnection getConnection() {
		return connection;
	}

	public void setConnection(MySqlDBConnection connection) {
		this.connection = connection;
	}

	public int insertCourse(Course c) {
		int r = 0;
		try {
		    String sql = "insert into course values(?,?,?,?)";
		    PreparedStatement ps = connection.getConnection().prepareStatement(sql);
		    ps.setString(1, c.getCourseid());
		    ps.setString(2, c.getCoursename());
		    ps.setInt(3, c.getCredit());
		    ps.setString(4, c.getCoursetype());
		    r = ps.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return r;
	}

	public List<Course> fetchAllCourses() {
		List<Course> list = new ArrayList<Course>();
		Course c;
		try {
			String sql = "select * from course";
			Statement st = connection.getConnection().createStatement();
			ResultSet set = st.executeQuery(sql);
			while (set.next()) {
				String courseid = set.getString(1);
				String coursename = set.getString(2);
				int credit = set.getInt(3);
				String coursetype = set.getString(4);
				c = new Course(courseid, coursename, credit, coursetype);
				list.add(c);
			}
		} catch (Exception e) {
		}
		return list;
	}

	public int updateCourse(Course c, String id) {
		int r = 0;
		try {
			String sql = "update course set coursename=?, credit=? where courseid=?";
			PreparedStatement ps = connection.getConnection().prepareStatement(sql);
			ps.setString(1, c.getCoursename());
			ps.setInt(2, c.getCredit());
//			ps.setString(3, get());
			r = ps.executeUpdate();
		} catch (Exception e) {
		}
		return r;
	}



	public int deleteCourse(String courseid) {
		int r = 0;
		try {
			String sql = "delete from course where courseid=?";
			PreparedStatement ps = connection.getConnection().prepareStatement(sql);
			ps.setString(1, courseid);
			r = ps.executeUpdate();
		} catch (Exception e) {
		}
		return r;
	}
	
	// fetchOneCourse
	public Course fetchOneCourse(String courseid) {
		Course c = null;
		try {
			String sql = "select * from course where courseid=?";
			PreparedStatement ps = connection.getConnection().prepareStatement(sql);
			ps.setString(1, courseid);
			ResultSet set = ps.executeQuery();
			if (set.next()) {
				String courseid1 = set.getString(1);
				String coursename = set.getString(2);
				int credit = set.getInt(3);
				String coursetype = set.getString(4);
				c = new Course(courseid1, coursename, credit, coursetype);
			}
		} catch (Exception e) {
		}
		return c;
	}

}
