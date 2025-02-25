package controller;

import SERVICE.CourseServiceImpl;
import SERVICE.StudentServiceImpl;
import techm1.Course;
import techm1.Student;

public class CourseController {
	private CourseServiceImpl service;

	public CourseController(CourseServiceImpl CourseService) {
		this.service = CourseService;
	}
	public int insertCourse(Course c) {
		return service.insertCourse(c);
	}

}
