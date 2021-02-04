import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;
import static java.lang.Character.valueOf;

public class ExamProblem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email= scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Complete")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Make":
                 String upperLower = tokens[1];
                 if (upperLower.equals("Upper")){
                    email =  email.toUpperCase();
                     System.out.println(email);
                 }else if (upperLower.equals("Lower")){
                   email = email.toLowerCase();
                     System.out.println(email);
                 }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(tokens[1]);
                String domain = email.substring(email.length() - count, email.length());
                    System.out.println(domain);
                    break;
                case "GetUsername":
                    if (email.contains("@")){
                        int index =email.indexOf("@");
                        String username = email.substring(0,index);
                        System.out.println(username);
                    }else{
                        System.out.printf("The email %s doesn't contain the @ symbol.%n",email);
                    }

                    break;
                case "Replace":
                String symbol = tokens[1];
                if (email.contains(symbol)){
                    email = email.replace(symbol, "-");
                    System.out.println(email);
                }
                    break;
                case "Encrypt":
                    for (int i = 0; i <email.length() ; i++) {
                        List<Character> chars = new ArrayList<>();
                       char currentChar = email.charAt(i);
                       chars.add(currentChar);
                        for (Character aChar : chars) {
                            System.out.print(valueOf(aChar) + " ");
                        }

                    }
                    break;
            }
            input=scanner.nextLine();
        }
    }
}
