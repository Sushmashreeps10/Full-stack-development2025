package Controller;

import Model.Student;
import Service.StudentSerivceImpl;

public class StudentController {

	    private StudentSerivceImpl studentService;

	    public StudentController(StudentSerivceImpl studentService) {
	        this.studentService = studentService;
	    }

	    public int deleteStudent(String sid) {  // ✅ Method should accept only ID
	        return studentService.deleteStudent(sid);
	    }

		public int insertStudent(Student s) {
			// TODO Auto-generated method stub
			return studentService.insertStudent(s);
		}


	}

	


