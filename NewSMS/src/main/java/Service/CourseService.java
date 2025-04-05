package Service;

import java.util.List;

import Model.Course;

//@Service - Stereotype annotation
//@Component - 
//@Repository
//@bean
 interface CourseService  {
	// java can upgrade
	public int insertCourse(Course c);
	public int updateCourse(Course c, String courseid);
	public int deleteCourse(String c);
	public List<Course> fetchAllCourses();
	public Course fetchOneCourse(String c);

}
 
 
 
 
 
 
