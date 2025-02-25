package SERVICE;

import java.util.List;

import repository.CourseRepository;
import repository.StudentRepository;
import techm1.Course;
import techm1.Student;

//public class CourseServiceImpl implements CourseService{
public class CourseServiceImpl {
	private CourseRepository repository;
	
	public CourseServiceImpl(CourseRepository repository) {
		this.repository = repository;
	}

	public int insertCourse(Course c) {
		// TODO Auto-generated method stub
		return repository.insertCourse(c);
	}
}
