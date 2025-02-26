package DataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlDBConnection {

	private Connection connection;
	public MysqlDBConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","sushma");
		Statement stmt= connection.createStatement(); 
		System.out.println("Connection established");
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}

