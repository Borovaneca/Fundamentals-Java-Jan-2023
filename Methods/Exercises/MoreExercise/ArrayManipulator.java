package Fundamentals.Methods.Exercises.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulatorByWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");

            String type = tokens[0];

            switch (type) {
                case "exchange": {
                    int index = Integer.parseInt(tokens[1]);

                    if (isInRange(arr, index)) {
                        rotateArray(arr, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                }
                case "max": {
                    int index;

                    if (tokens[1].equals("even")) {
                        index = findMaxEven(arr);
                    } else {
                        index = findMaxOdd(arr);
                    }

                    if (index != -1) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");
                    }
                    break;
                }
                case "min": {
                    int index;

                    if (tokens[1].equals("even")) {
                        index = findMinEven(arr);
                    } else {
                        index = findMinOdd(arr);
                    }

                    if (index != -1) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");
                    }
                    break;
                }
                case "first": {
                    int count = Integer.parseInt(tokens[1]);

                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (tokens[2].equals("even")) {
                            int[] result = getFirstEven(arr, count);
                            printArray(result);
                        } else {
                            int[] result = getFirstOdd(arr, count);
                            printArray(result);
                        }
                    }
                    break;
                }
                case "last": {
                    int count = Integer.parseInt(tokens[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (tokens[2].equals("even")) {
                            int[] result = getLastEven(arr, count);
                            printArray(result);
                        } else {
                            int[] result = getLastOdd(arr, count);
                            printArray(result);
                        }
                    }
                    break;
                }
            }

            command = scanner.nextLine();
        }

        printArray(arr);
    }

    private static int[] getLastOdd(int[] arr, int count) {
        int[] result = new int[count];

        Arrays.fill(result, -1);

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];

            if (num % 2 != 0 && index < result.length) {
                result[index] = num;
                index++;
            }
        }

        int[] theDeal = new int[result.length];

        int in = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            theDeal[in++] = result[i];
        }

        return theDeal;
    }

    private static int[] getLastEven(int[] arr, int count) {
        int[] result = new int[count];

        Arrays.fill(result, -1);

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            if (num % 2 == 0 && index < result.length) {
                result[index] = num;
                index++;
            }
        }

        int[] theDeal = new int[result.length];

        int in = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            theDeal[in++] = result[i];
        }

        return theDeal;
    }

    private static int[] getFirstOdd(int[] array, int count) {
        int[] result = new int[count];

        Arrays.fill(result, -1);

        int index = 0;

        for (int number : array) {
            if (number % 2 != 0 && index < result.length) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    private static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }

            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else if (arr[i + 1] != -1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }

        System.out.println("]");
    }

    private static int[] getFirstEven(int[] array, int count) {
        int[] result = new int[count];

        Arrays.fill(result, -1);

        int index = 0;

        for (int number : array) {
            if (number % 2 == 0 && index < result.length) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    private static int findMinOdd(int[] arr) {
        int index = -1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minValue) {
                minValue = arr[i];
                index = i;
            }
        }

        return index;
    }

    private static int findMinEven(int[] arr) {
        int index = -1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minValue) {
                minValue = arr[i];
                index = i;
            }
        }

        return index;
    }

    private static int findMaxOdd(int[] arr) {
        int index = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }

        return index;
    }

    private static int findMaxEven(int[] arr) {
        int index = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }

        return index;
    }

    private static void rotateArray(int[] arr, int index) {
        int[] left = new int[index + 1];
        int[] right = new int[arr.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        int nextIndex = 0;
        for (int i = index + 1; i < arr.length; i++) {
            right[nextIndex] = arr[i];
            nextIndex++;
        }

        for (int i = 0; i < right.length; i++) {
            arr[i] = right[i];
        }

        for (int i = right.length; i < arr.length; i++) {
            arr[i] = left[i - right.length];
        }
    }

    private static boolean isInRange(int[] arr, int index) {
        return index >= 0 && index < arr.length;
    }
}
