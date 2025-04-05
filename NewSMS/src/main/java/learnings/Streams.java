package learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Model.Course;
import Model.Student;

public class Streams {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>
		(Arrays.asList(
	            new Student("101", "sushma", "sushma@gmail.com", "Bangalore", 1),
	            new Student("102", "myself", "myself@gmail.com", "Doddaballapur", 2),
	            new Student("103", "shree", "shree@gmail.com", "Pulaganahalli", 3)
	        ));
		
	  // 1. Creating Course List
        List<Course> courses = new ArrayList<>
        (Arrays.asList(
            new Course("C101", "Math", 3, "Core"),
            new Course("C102", "Physics", 4, "Core"),
            new Course("C103", "History", 2, "Elective")
        ));
        
     //2. Print all students
        students.stream().forEach(System.out::println);
        
        System.out.println("-----------------------------------------------------");
        
     //3. Filter students in 2nd year
        List<Student> secondYearStudents = students.stream()
                .filter(s -> s.getYear() == 2)
                .collect(Collectors.toList());
        System.out.println("second year students are =" + secondYearStudents);
        
        System.out.println("-----------------------------------------------------");
        
      //4. Extract student names
        List<String> extractNames = students.stream()
        		.map(Student::getSname)
        		.collect(Collectors.toList());
        System.out.println("extracted names are=" + extractNames);
        
        System.out.println("-----------------------------------------------------");
        
     //5. Sort students by name
        List<Student> sortings = students.stream()
        		.sorted(Comparator.comparing(Student::getSname))
        		.collect(Collectors.toList());
        System.out.println("names are sorted = " + sortings);
        
        
        System.out.println("-----------------------------------------------------");
        
     //6. Count total students
        long sCount = students.stream().count();
        System.out.println("Count of students:- " + sCount);
        
        System.out.println("-----------------------------------------------------");
        
     //7. Collect course names (same as 4th)
       List<String> courseName = courses.stream()
    		   .map(Course::getCoursename)
    		   .collect(Collectors.toList());
       System.out.println("collection of names:-" + courseName);
       
       
       System.out.println("-----------------------------------------------------");
       
       //8. Check if any student is in 3rd year
       boolean  matchs = students.stream()
    		   .anyMatch(s -> s.getYear() == 3);
       System.out.println("students 3rd year = " + matchs);
       
       System.out.println("-----------------------------------------------------");
       
       // Check if all courses are Core
       boolean allCoreCourses = courses.stream()
               .allMatch(c -> c.getCoursetype().equals("Core"));
           System.out.println("Are all courses Core? " + allCoreCourses);
           
       System.out.println("-----------------------------------------------------");
       
    // Check if no student is from Florida
       boolean noneFromFlorida = students.stream()
           .noneMatch(s -> s.getAddress().equals("Florida"));
       System.out.println("No students from Florida? " + noneFromFlorida);
       
       System.out.println("-----------------------------------------------------");
       
    // Get first student
       Optional<Student> firstStudent = students.stream().findFirst();
       firstStudent.ifPresent(s -> System.out.println("First Student: " + s));
       
       System.out.println("-----------------------------------------------------");
       
       // Get any student
       Optional<Student> anyStudent = students.stream().findAny();
       anyStudent.ifPresent(s -> System.out.println("Any Student: " + s));
       
       System.out.println("-----------------------------------------------------");
       
    // Get student with max year
       Optional<Student> oldestStudent = students.stream()
           .max(Comparator.comparingInt(Student::getYear));
       
//       System.out.println("max :- " + oldestStudent);
//       oldestStudent.ifPresent(System.out::println);
       oldestStudent.ifPresent(s -> System.out.println("Oldest Student: " + s));
       
       System.out.println("-----------------------------------------------------");
       
       // Get student with min year
       Optional<Student> youngestStudent = students.stream()
           .min(Comparator.comparingInt(Student::getYear));
       youngestStudent.ifPresent(s -> System.out.println("Youngest Student: " + s));
       
       System.out.println("-----------------------------------------------------");
       
    // Concatenate student names
       String allStudentNames = students.stream()
           .map(Student::getSname)
           .reduce("", (name1, name2) -> name1 + " " + name2);
       System.out.println("All Student Names: " + allStudentNames.trim());
       
       System.out.println("-----------------------------------------------------");
       
       // Group students by year
       Map<Integer, List<Student>> studentsByYear = students.stream()
           .collect(Collectors.groupingBy(Student::getYear));
       System.out.println("Students Grouped by Year: " + studentsByYear);
       
       
      





       


		

	}

}
