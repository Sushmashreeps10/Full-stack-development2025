package Service;

import Model.Student;

interface StudentService {
	
	public int insertStudent(Student s);
	public<list> Student fetchAll();
	public Student fetchOneStudent(String s);
	public int updateStudent(Student s, String id);
	public<list> Student fetchAll1();
	public Student fetchOneStudent1(String s);
	public int deleteStudent(Student s);
	public<list> Student fetchAll11();
	public Student fetchOneStudent11(String s);
	

}
