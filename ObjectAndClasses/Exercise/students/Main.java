package Fundamentals.OOP.Exercise.students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String currentStudent = scanner.nextLine();
            Student student = new Student(
                    currentStudent.split(" ")[0],
                    currentStudent.split(" ")[1],
                    Double.parseDouble(currentStudent.split(" ")[2]));

            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
