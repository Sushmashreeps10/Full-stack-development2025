package Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DataSource.MysqlDBConnection;
import Model.Student;

public class StudentRepository {

private static final String s = null;
//	public final int insertStudent = 0;
	
	private MysqlDBConnection connection;                                           
	//alt shift s                                                                   
	                                                                                
	public StudentRepository(MysqlDBConnection connection) {                        
		super();                                                                    
		this.connection = connection;                                               
	}                                                                               
	                                                                                
	public MysqlDBConnection getConnection() {                                      
		return connection;                                                          
	}                                                                               
	public void setConnection(MysqlDBConnection connection) {                       
		this.connection = connection;                                               
	}                                                                               
	public int insertStudent(Student s) {                                           
		int r=0;                                                                    
		try {                                                                       
		String sql="insert into student values(?,?,?,?,?)";                         
		                                                                            
		PreparedStatement ps=connection.getConnection().prepareStatement(sql);      
		ps.setString(1, s.getSid());                                                
		ps.setString(2, s.getSname());                                              
		ps.setString(3,s.getEmail());                                               
		ps.setString(4, s.getAddress());                                            
		ps.setInt(5, s.getYear());                                                  
		 r=ps.executeUpdate();                                                      
		                                                                            
		}catch(Exception e) {}                                                      
		return r;                                                                   
		}
	public List<Student> fetchAllStudents() {                          
		List<Student> list=new ArrayList<Student>();                   
		Student s;                                                     
		try {                                                          
		String sql="select * from student";	                           
		Statement st=connection.getConnection().createStatement();     
		ResultSet set=st.executeQuery(sql);                            
		while(set.next()) {                                            
			String id=set.getString(1);                                
			String name=set.getString(2);                              
			String email=set.getString(3);                             
			String address=set.getString(4);                           
			int year=set.getInt(5);                                    
			s=new Student(id,name,email,address,year);                 
			list.add(s);                                               
		}                                                              
		}catch(Exception e) {}                                         
		return list;                                                   
	}                                                                                            
	public int updateStudent(Student s, String id) {                                             
		int r=0;                                                                                 
		try {                                                                                    
		String sql="update student set address=?, year=? where sid=?";	                         
		PreparedStatement ps=connection.getConnection().prepareStatement(sql);                   
		ps.setString(1, s.getAddress());                                                         
		ps.setInt(2, s.getYear());                                                               
		ps.setString(3, id);                                                                     
		r=ps.executeUpdate();                                                                    
		}catch(Exception e) {}                                                                   
		return r;                                                                                
	}              
	public List<Student> fetchAllStudents1() {                          
		List<Student> list=new ArrayList<Student>();                   
		Student s;                                                     
		try {                                                          
		String sql="select * from student";	                           
		Statement st=connection.getConnection().createStatement();     
		ResultSet set=st.executeQuery(sql);                            
		while(set.next()) {                                            
			String id=set.getString(1);                                
			String name=set.getString(2);                              
			String email=set.getString(3);                             
			String address=set.getString(4);                           
			int year=set.getInt(5);                                    
			s=new Student(id,name,email,address,year);                 
			list.add(s);                                               
		}                                                              
		}catch(Exception e) {}                                         
		return list;                                                   
	}             
	public int deleteStudent(String sid) {                                                         
	    int r = 0;                                                                                  
	    try {     
	        String sql = "DELETE FROM student WHERE sid = ?";	                                     
	        PreparedStatement ps = connection.getConnection().prepareStatement(sql);               
	        ps.setString(1, sid);                                                                  
	        r = ps.executeUpdate();  // Corrected execution                                
	    } catch (Exception e) {  
	        e.printStackTrace(); // Print error for debugging
	    }                                                                    
	    return r;                                                                                
	}

	public List<Student> fetchAllStudents11() {                          
	    List<Student> list = new ArrayList<Student>();                   
	    try {                                                          
	        String sql = "SELECT * FROM student";  // Corrected query                  
	        Statement st = connection.getConnection().createStatement();     
	        ResultSet set = st.executeQuery(sql);                            
	        while (set.next()) {                                            
	            String id = set.getString(1);                                
	            String name = set.getString(2);                              
	            String email = set.getString(3);                             
	            String address = set.getString(4);                           
	            int year = set.getInt(5);                                    
	            Student s = new Student(id, name, email, address, year);                 
	            list.add(s);                                                
	        }                                                               
	    } catch (Exception e) {  
	        e.printStackTrace(); // Print error for debugging
	    }                                         
	    return list;                                                    
	}        
      
		
		
	}


