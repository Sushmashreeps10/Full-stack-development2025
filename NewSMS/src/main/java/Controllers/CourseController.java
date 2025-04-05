package Controllers;

import java.util.List;

import Model.Course;
import Service.CourseServiceImpl;

public class CourseController {

	private CourseServiceImpl service;

	public CourseController(CourseServiceImpl service) {
		super();
		this.service = service;
	}

	public int insertCourse(Course c) {
		return service.insertCourse(c);
	}

	public int updateCourse(Course c) {
		return service.updateCourse(c, c.getCourseid());
	}

	public List<Course> fetchAllCourses() {
		return service.fetchAllCourses();
	}

}
