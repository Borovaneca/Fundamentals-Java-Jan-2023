package Fundamentals.OOP.Exercise.students;

public class Student {

    private String firstName;
    private String lastName;
    private Double grade;


    public Student(String firstName, String lastName, Double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Double getGrade(){
        return this.grade;
    }

    @Override
    public String toString(){
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }
}
