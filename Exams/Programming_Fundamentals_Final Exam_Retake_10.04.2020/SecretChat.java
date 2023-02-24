package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretChat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(br.readLine());

        String command;

        while (!"Reveal".equals(command = br.readLine())) {

            String[] tokens = command.split(":\\|:");
            String currentCommand = tokens[0];
            boolean printedError = false;

            if (currentCommand.equals("InsertSpace")) {
                int index = Integer.parseInt(tokens[1]);
                sBuilder.insert(index, " ");

            } else if (currentCommand.equals("Reverse")) {
                String substring = tokens[1];
                if (sBuilder.toString().contains(substring)) {
                    String reversed = new StringBuilder(substring).reverse().toString();

                   int firstIndex = sBuilder.indexOf(substring);
                   int lastIndex = firstIndex + (substring.length());

                   sBuilder.replace(firstIndex, lastIndex, "");
                   sBuilder.append(reversed);

                } else {
                    System.out.println("error");
                    printedError = true;
                }

            } else if (currentCommand.equals("ChangeAll")) {
                String substring = tokens[1];
                String newText = tokens[2];

                while (sBuilder.toString().contains(substring)) {
                    int firstIndex = sBuilder.indexOf(substring);
                    int lastIndex = firstIndex + (substring.length());

                    sBuilder.replace(firstIndex, lastIndex, newText);
                }
            }
            if (!printedError) {
                System.out.println(sBuilder.toString());
            }
        }
        System.out.println("You have a new text message: " + sBuilder.toString());
    }
}
