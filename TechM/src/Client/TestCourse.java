package Client;

import DataSource.MysqlDBConnection;
import Service.CourseServiceImpl;
import Controller.CourseController;
import Repository.CourseRepository;
import Model.Course;

public class TestCourse {
	public static void main(String[] args) {
	try {
    	MysqlDBConnection dbconnection1 = new MysqlDBConnection();
    	CourseRepository courserRepository = new CourseRepository(dbconnection1);
    	CourseServiceImpl courseService = new CourseServiceImpl(courserRepository);
    	CourseController CourseController = new CourseController(courseService);
        Course Course = new Course("FAV1", "TCS", 7, "Lab9");
        int result = CourseController.insertCourse(Course);
        

        if (result > 0) {
            System.out.println("Course inserted successfully!");
        } else {
            System.out.println("Failed to insert course.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
	
	System.out.println("----------------------------------------");
	
	try {
    	MysqlDBConnection dbconnection1 = new MysqlDBConnection();
    	CourseRepository courserRepository = new CourseRepository(dbconnection1);
    	CourseServiceImpl courseService = new CourseServiceImpl(courserRepository);
    	CourseController CourseController = new CourseController(courseService);
    	Course Course = new Course("DSA101", "Google", 7, "Lab3");
        int result = CourseController.deleteCourse(Course.getCid());
        

        if (result > 0) {
            System.out.println("Course deleted successfully!");
        } else {
            System.out.println("Failed to deleted course.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
	
	System.out.println("----------------------------------------");

	
	
	
	}
	
	
	
	

}

