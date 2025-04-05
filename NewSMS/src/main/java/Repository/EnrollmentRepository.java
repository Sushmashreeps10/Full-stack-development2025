package Repository;

import java.sql.*;
import DataSource.MySqlDBConnection;
import Model.Enrollment;

// Datasource   --  Configuration
// JDBC calls 

// this violates SOLID principle
public class EnrollmentRepository {
	// get the datasourse object
	// Injecting/wiring an object
	// @autowire
	private MySqlDBConnection connection;
	// alt shift s

	public EnrollmentRepository(MySqlDBConnection connection) {
		super();
		this.connection = connection;
	}

	public MySqlDBConnection getConnection() {
		return connection;
	}

	public void setConnection(MySqlDBConnection connection) {
		this.connection = connection;
	}

	public int insertEnrollment(Enrollment e) {
		int r = 0;
		 try {
		        Connection conn = connection.getConnection();
		        conn.setAutoCommit(false); // Start transaction

		        // Check if student exists
		        PreparedStatement checkStudent = conn.prepareStatement("SELECT COUNT(*) FROM student WHERE sid = ?");
		        checkStudent.setInt(1, e.getSid());
		        ResultSet rsStudent = checkStudent.executeQuery();
		        if (rsStudent.next() && rsStudent.getInt(1) == 0) {
		            System.out.println("Student does not exist!");
		            return 0;
		        }

		        // Check if course exists
		        PreparedStatement checkCourse = conn.prepareStatement("SELECT COUNT(*) FROM course WHERE courseid = ?");
		        checkCourse.setString(1, e.getCourseid());
		        ResultSet rsCourse = checkCourse.executeQuery();
		        if (rsCourse.next() && rsCourse.getInt(1) == 0) {
		            System.out.println("Course does not exist!");
		            return 0;
		        }

		        // Insert into enrollment
		        String sql = "INSERT INTO enrollment (sid, courseid) VALUES (?, ?)";
		        PreparedStatement ps = conn.prepareStatement(sql);
		        ps.setInt(1, e.getSid());
		        ps.setString(2, e.getCourseid());
		        r = ps.executeUpdate();

		        conn.commit(); // Commit transaction
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		    return r;
	}

}
