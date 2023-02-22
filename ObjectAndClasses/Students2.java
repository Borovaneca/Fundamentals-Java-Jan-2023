package Fundamentals.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String secondName;
        int age;
        String town;


        public Student(String firstName, String secondName, int age, String town) {

            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public int getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        private int setAge(int age) {
            this.age = age;
            return this.age;
        }

        private String setTown(String town) {
            this.town = town;
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {

            String[] studentsArr = input.split(" ");
            String firstName = studentsArr[0];
            String secondName = studentsArr[1];
            int age = Integer.parseInt(studentsArr[2]);
            String town = studentsArr[3];
            Student student = new Student(firstName, secondName, age, town);
            if (IsExisting(studentList, firstName, secondName)) {
                student.setTown(town);
                student.setAge(age);
                for (Student currentStudent : studentList){
                    if (currentStudent.getFirstName().equals(firstName) && currentStudent.getSecondName().equals(secondName)){
                        studentList.remove(currentStudent);
                        studentList.add(student);
                    }
                }


            } else {
                studentList.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student item : studentList) {
            if (item.getTown().equals(city)) {
                System.out.println(item.getFirstName() + " " + item.getSecondName() + " is " + item.getAge() + " years old");
            }
        }
    }

    private static boolean IsExisting(List<Student> studentList, String firstName, String secondName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return true;
            }
        }
        return false;
    }
}
