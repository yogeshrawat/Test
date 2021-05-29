import LinkedList.LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Yogesh", 50));
        studentList.add(new Student("Sangeeta", 80));
        studentList.add(new Student("Roger", 85));
        studentList.add(new Student("Mirka", 75));


        List<Student> filterList = studentList.stream().filter(student -> student.marks >= 80)
                .collect(Collectors.toList());

        filterList.forEach(student -> System.out.println(student.name));

        List<Student> compareList = studentList.stream().sorted(Comparator.comparing(student -> student.name))
                .collect(Collectors.toList());

        compareList.forEach(student -> System.out.println(student.name));
    }


     static class Student{
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }
}
