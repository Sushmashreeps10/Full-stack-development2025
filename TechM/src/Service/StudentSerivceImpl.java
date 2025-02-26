package Service;

import Model.Student;
import Repository.StudentRepository;

public class StudentSerivceImpl {
    private StudentRepository studentRepository;

    public StudentSerivceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public int insertStudent(Student s) {
        return studentRepository.insertStudent(s);
    }
    
    public int deleteStudent(String sid) {
        return studentRepository.deleteStudent(sid);
    }


}

	
	
	

