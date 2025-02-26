package Client;

import Controller.StudentController;
import DataSource.MysqlDBConnection;
import Model.Student;
import Repository.StudentRepository;
//import SERVICE.StudentServiceImpl;
import Service.StudentSerivceImpl;

public class TestStudent {
    public static void main(String[] args) {	 
    	try {
            MysqlDBConnection dbConnection = new MysqlDBConnection();
            StudentRepository studentRepository = new StudentRepository(dbConnection);
            StudentSerivceImpl studentService = new StudentSerivceImpl(studentRepository);
            StudentController studentController = new StudentController(studentService);
            Student student = new Student("5", "Shree", "shree@example.com", "Bangalore", 2028);
            int result = studentController.insertStudent(student);

            if (result > 0) {
                System.out.println("Student inserted successfully!");
            } else {
                System.out.println("Failed to insert student.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("-------------------------------------------");
    	
        try {
            MysqlDBConnection dbConnection = new MysqlDBConnection();
            StudentRepository studentRepository = new StudentRepository(dbConnection);
            StudentSerivceImpl studentService = new StudentSerivceImpl(studentRepository);
            StudentController studentController = new StudentController(studentService);
            
            Student student = new Student("5", "Shree", "shree@example.com", "Bangalore", 2028);
            

            int result = studentController.deleteStudent(student.getSid());

            if (result > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Failed to delete student.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------------------------");
    }
}
