package Controllers;

import java.util.List;

import Model.Student;
import Service.StudentServiceImpl;

public class StudentController {

	private StudentServiceImpl service;

	public StudentController(StudentServiceImpl service) {
		super();
		this.service = service;
	}
	public int insertStudent(Student s) {
		return service.insertStudent(s);
	}
	public int updateStudent(Student s) {
		return service.insertStudent(s);
	}
	public List<Student> fetchALlStudent() {
		return service.fetchAll();
	}
	
	
	

}
