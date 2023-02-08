    package Fundamentals.List.Exercise;

    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;
    import java.util.stream.Collectors;

    public class    SoftUniCoursePlanning {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            List<String> courses = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

            String command = scanner.nextLine();
            while (!command.equals("course start")) {

                String[] commandArr = command.split(":");
                String currentCommand = commandArr[0];
                if (currentCommand.equals("Add")) {
                    if (!courses.contains(commandArr[1])) {
                        courses.add(commandArr[1]);
                    }
                } else if (currentCommand.equals("Insert")) {
                    String lessonTitle = commandArr[1];
                    int index = Integer.parseInt(commandArr[2]);
                    if (!courses.contains(lessonTitle)) {
                        courses.add(index, lessonTitle);
                    }
                } else if (currentCommand.equals("Remove")) {
                    String lessonTitle = commandArr[1];
                    if (courses.contains(lessonTitle)) {
                        courses.removeAll(Arrays.asList(lessonTitle));
                    }
                } else if (currentCommand.equals("Swap")) {
                    String firstTitle = commandArr[1];
                    String secondTitle = commandArr[2];
                    boolean isExercised1 = courses.contains(firstTitle+"-Exercise");
                    boolean isExercised2 = courses.contains(secondTitle+"-Exercise");
                    int indexOfFirst = 0;
                    int indexOfSecond = 0;
                    if (courses.contains(firstTitle) && courses.contains(secondTitle)) {
                        for (int i = 0; i < courses.size(); i++) {
                            if (courses.get(i).equals(firstTitle)){
                                indexOfFirst = i;
                            } else if (courses.get(i).equals(secondTitle)){
                                indexOfSecond = i;
                            }
                        }
                        if (isExercised1){
                            courses.set(indexOfFirst, secondTitle);
                            courses.set(indexOfSecond, firstTitle);
                            courses.add(indexOfSecond+1, firstTitle+"-Exercise");
                            courses.remove(indexOfFirst+2);
                        } else if (isExercised2){
                            courses.set(indexOfSecond, firstTitle);
                            courses.set(indexOfFirst, secondTitle);
                            courses.add(indexOfFirst+1, secondTitle+"-Exercise");
                            courses.remove(indexOfSecond+2);
                        } else {
                            courses.set(indexOfSecond, firstTitle);
                            courses.set(indexOfFirst, secondTitle);
                        }

                    }
                } else if (currentCommand.equals("Exercise")) {
                    String lessonTitle = commandArr[1];
                    String exercise = "-Exercise";
                    if (!courses.contains(lessonTitle)) {
                        courses.add(lessonTitle);
                        courses.add(lessonTitle+exercise);
                    } else if (courses.contains(lessonTitle+"-Exercise")){
                        command = scanner.nextLine();
                        continue;
                    } else {
                        for (int i = 0; i < courses.size(); i++) {
                            if (courses.get(i).equals(lessonTitle)){
                                lessonTitle = lessonTitle+exercise;
                                courses.add(i+1, lessonTitle);
                                break;
                            }
                        }
                    }
                }

                command = scanner.nextLine();
            }
            for (int i = 1; i <= courses.size(); i++) {
                System.out.printf("%d.%s%n", i, courses.get(i - 1));
            }
        }
    }
