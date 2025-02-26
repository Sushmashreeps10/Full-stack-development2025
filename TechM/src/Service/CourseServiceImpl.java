package Service;

import Model.Course;
import Repository.CourseRepository;

public class CourseServiceImpl {

	private CourseRepository repository;
	
	public CourseServiceImpl(CourseRepository repository) {
		this.repository = repository;
	}

	public int insertCourse(Course c) {
		// TODO Auto-generated method stub
		return repository.insertCourse(c);
	}

	public int deleteCourse(String id) {
		// TODO Auto-generated method stub
		return repository.deleteCouse(id);
	}
}

