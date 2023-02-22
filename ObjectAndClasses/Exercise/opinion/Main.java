package Fundamentals.OOP.Exercise.opinion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();
            if (Integer.parseInt(data.split(" ")[1]) > 30) {

                Person person = new Person(data.split(" ")[0], Integer.parseInt(data.split(" ")[1]));
                personList.add(person);
            }
        }
        for (Person person : personList){
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
