package Service;

import java.util.List;

import Model.Course;
import Repository.CourseRepository;

public class CourseServiceImpl implements CourseService{
	private CourseRepository repository;
	
	public CourseServiceImpl() {
		super();
	}
	public CourseServiceImpl(CourseRepository repository) {
		this.repository = repository;
	}
	public int insertCourse(Course c) {
		return repository.insertCourse(c);
	}
	public int updateCourse(Course c, String courseid) {
		return repository.updateCourse(c, courseid);
	}
	public int deleteCourse(String c) {
		return repository.deleteCourse(c);
	}
	public List<Course> fetchAllCourses() {
		return repository.fetchAllCourses();
	}
	public Course fetchOneCourse(String c) {
		return repository.fetchOneCourse(c);
	}
}
