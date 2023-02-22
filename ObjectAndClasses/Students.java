package Fundamentals.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student {
        String firstName;
        String secondName;
        String age;
        String city;


        public Student(String firstName, String secondName, String age, String city){

            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public String getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {

            String[] studentsArr = input.split(" ");
            Student student = new Student(studentsArr[0], studentsArr[1], studentsArr[2], studentsArr[3]);
            studentList.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student item : studentList){
            if (item.getCity().equals(city)){
                System.out.println(item.getFirstName() + " " + item.getSecondName() + " is " + item.getAge() + " years old");
            }
        }
    }
}
