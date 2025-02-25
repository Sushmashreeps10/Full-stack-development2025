package SERVICE;

import repository.StudentRepository;
import techm1.Student;

public class StudentServiceImpl {
private StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}
	public int insertStudent(Student s) {
		return repository.insertStudent(s);
	}

}
