package Controller;

import Service.CourseServiceImpl;
import Model.Course;

public class CourseController {
		private CourseServiceImpl service;

		public CourseController(CourseServiceImpl CourseService) {
			this.service = CourseService;
		}
		public int insertCourse(Course c) {
			return service.insertCourse(c);
		}
		public int deleteCourse(String id) {
			return service.deleteCourse(id);
		}


	}
