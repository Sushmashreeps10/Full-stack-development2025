package UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controllers.EnrollmentController;
import DataSource.MySqlDBConnection;
import Model.Enrollment;
import Repository.EnrollmentRepository;
import Service.EnrollmentServiceImpl;

public class EnrollmentControllerTest {

    private MySqlDBConnection connection;
	private EnrollmentRepository repository;
    private EnrollmentServiceImpl enrollmentService;
    private EnrollmentController enrollmentController;

    @BeforeEach
    public void setup() throws Exception {
    	connection=new MySqlDBConnection();
        repository = new EnrollmentRepository(connection);  // Make sure this constructor doesn't have dependencies
        enrollmentService = new EnrollmentServiceImpl(repository);
        enrollmentController = new EnrollmentController(enrollmentService);
    }

    @Test
    public void testInsertEnrollment() {
    	Enrollment e=new Enrollment(50,"CSE1001");
    	assertNotNull(e);  // Modify assertion as needed
        int result = enrollmentController.insertEnrollment(e);
        System.out.println("Enrollment inserted successfully");
        assertEquals(1, result, "Enrollment insertion success!");
        // Assert that Enrollment was inserted
        
    }
}