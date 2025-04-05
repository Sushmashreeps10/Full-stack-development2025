package Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Students implements Comparable<Students> {
    private int id;
    private String name;
    private double cgpa;

    public Students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
    }

    @Override
    public int compareTo(Students s) {
        return Double.compare(this.cgpa, s.cgpa);
    }

    public static void print(Students s) {
        System.out.println(s.getName());
    }

    public static boolean check(Students s) {
        return s.getCgpa() > 7.5;
    }
}

public class TestFIForCollection {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(1001, "sushma", 9.8));
        list.add(new Students(102, "bhavan", 9.0));
        list.add(new Students(103, "unknown", 8.5));
        list.add(new Students(104, "akash", 9.0));

        // Sorting the list based on CGPA
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Consumer Functional Interface (Print Student Names)
        Consumer<Students> a = Students::print;
        for (Students s : list) {
            a.accept(s);
        }

        // Predicate Functional Interface (Check CGPA > 7.5)
        Predicate<Students> p = Students::check;
        
        System.out.println("\nStudents with CGPA > 7.5:");
        list.stream().filter(p).forEach(System.out::println);

        // Filtering students with CGPA > 9
        List<Students> hasGreater = list.stream()
                                        .filter(student -> student.getCgpa() > 9)
                                        .collect(Collectors.toList());
        System.out.println("\nStudents with CGPA > 9:");
        System.out.println(hasGreater);
    }
}
