package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command =scanner.nextLine();

        LinkedHashMap<String, List<String>> coursesList = new LinkedHashMap<>();
        while (!command.equals("end")){
            String[] commandArr = command.split(" : ");

            String course = commandArr[0];
            String student = commandArr[1];

            if (!coursesList.containsKey(course)){
                coursesList.put(course, new ArrayList<>());
                coursesList.get(course).add(student);
            } else {
                coursesList.get(course).add(student);
            }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : coursesList.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }


    }
}
