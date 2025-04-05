package UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controllers.CourseController;
import DataSource.MySqlDBConnection;
import Model.Course;
import Repository.CourseRepository;
import Service.CourseServiceImpl;

public class CourseControllerTest {

    private MySqlDBConnection connection;
	private CourseRepository repository;
    private CourseServiceImpl courseService;
    private CourseController courseController;

    @BeforeEach
    public void setup() throws Exception {
    	connection=new MySqlDBConnection();
        repository = new CourseRepository(connection);  // Make sure this constructor doesn't have dependencies
        courseService = new CourseServiceImpl(repository);
        courseController = new CourseController(courseService);
    }

    @Test
    public void testInsertCourse() {
    	Course c=new Course("7400","JAVA",3,"Core");
    	assertNotNull(c);  // Modify assertion as needed
        int result=courseController.insertCourse(c);
        System.out.println("Course inserted successfully");
        assertEquals(1, result, "Course insertion success!");
        // Assert that Course was inserted
        
    }
}