package client;

import DataSource.MysqlDBConnection;
import SERVICE.CourseServiceImpl;
import controller.CourseController;
import repository.CourseRepository;
import techm1.Course;

public class CourseTest {
	public static void main(String[] args) {
		try {
        	MysqlDBConnection dbconnection1 = new MysqlDBConnection();
        	CourseRepository courserRepository = new CourseRepository(dbconnection1);
        	CourseServiceImpl courseService = new CourseServiceImpl(courserRepository);
        	CourseController CourseController = new CourseController(courseService);
            Course Course = new Course("CSE816", "TechMahindra", 5, "Lab");
            int result = CourseController.insertCourse(Course);
            

            if (result > 0) {
                System.out.println("Course inserted successfully!");
            } else {
                System.out.println("Failed to insert course.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
