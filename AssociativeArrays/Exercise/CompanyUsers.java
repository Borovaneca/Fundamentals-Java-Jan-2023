package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyList = new LinkedHashMap<>();

        while (!command.equals("End")){
            String[] commandArr = command.split(" -> ");
            String companyName = commandArr[0];
            String username = commandArr[1];
            if (!companyList.containsKey(companyName)){
                companyList.put(companyName, new ArrayList<>());
                companyList.get(companyName).add(username);
            } else {
                boolean checker = false;
                for (int i = 0; i < companyList.get(companyName).size(); i++) {
                    if (companyList.get(companyName).get(i).equals(username)){
                        checker = true;
                        break;
                    }
                }
                if (!checker){
                    companyList.get(companyName).add(username);
                }
            }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyList.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String item : entry.getValue()){
                System.out.printf("-- %s%n", item);
            }
        }

    }
}
