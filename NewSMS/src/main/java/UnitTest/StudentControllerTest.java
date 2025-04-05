package UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controllers.StudentController;
import DataSource.MySqlDBConnection;
import Model.Student;
import Repository.StudentRepository;
import Service.StudentServiceImpl;

public class StudentControllerTest {

    private MySqlDBConnection connection;
	private StudentRepository repository;
    private StudentServiceImpl studentService;
    private StudentController studentController;

    @BeforeEach
    public void setup() throws Exception {
    	connection=new MySqlDBConnection();
        repository = new StudentRepository(connection);  // Make sure this constructor doesn't have dependencies
        studentService = new StudentServiceImpl(repository);
        studentController = new StudentController(studentService);
    }

    @Test
    public void testInsertStudent() {
    	Student e=new Student("1001","john","john@gmail.com","Mumbai",2021);
    	assertNotNull(e);  // Modify assertion as needed
        int result = studentController.insertStudent(e);
        System.out.println("Student inserted successfully");
        assertEquals(1, result, "Student insertion success!");
        // Assert that Enrollment was inserted
        
    }
}