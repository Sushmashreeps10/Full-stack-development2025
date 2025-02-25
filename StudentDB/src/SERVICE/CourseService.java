package SERVICE;
import java.util.List;
import techm1.Course;

//@Service - Stereotype annotation
//@Component - 
//@Repository
//@bean
interface CourseService {
	public int insertCourse(Course c);
	public int updateCourse(Course c, String id);
	public int deleteCourse(String id);
	public List<Course> fetchAll();
	public Course fetchOneCourse(String id);
}