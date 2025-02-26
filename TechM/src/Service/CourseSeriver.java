package Service;

import java.util.List;

import Model.Course;

public class CourseSeriver {

	interface CourseService {
		public int insertCourse(Course c);
		public int updateCourse(Course c, String id);
		public int deleteCourse(String id);
		public List<Course> fetchAll();
		public Course fetchOneCourse(String id);
	}
}