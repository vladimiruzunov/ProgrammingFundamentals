import java.util.Scanner;

public class ExamPrepActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String operations = scanner.nextLine();
        while (!operations.equals("Generate")){
            String[] tokens = operations.split(">>>");
            String cases = tokens[0];
            switch (cases){
                case "Contains":
                    String substring = tokens[1];
                if (input.contains(substring)){
                    System.out.printf("%s contains %s",input, substring);
                }else {
                    System.out.println("Substring not found!");
                }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String changed = input.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")){
                        changed=changed.toUpperCase();
                        StringBuilder sb = new StringBuilder();
                        sb.append(input);
                        sb.replace(startIndex,endIndex,(changed));
                        input=sb.toString();
                        System.out.println(input);
                    }else if (upperOrLower.equals("Lower")){
                        changed=changed.toLowerCase();
                        StringBuilder sb = new StringBuilder();
                        sb.append(input);
                        sb.replace(startIndex,endIndex,changed);
                        input = sb.toString();
                        System.out.println(input);
                    }
                    break;
                case "Slice":
                    int startIndexOfDelete = Integer.parseInt(tokens[1]);
                    int endIndexOfDelete = Integer.parseInt(tokens[2]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(input);
                    sb.delete(startIndexOfDelete, endIndexOfDelete);
                    input = sb.toString();
                    System.out.println(input);
                    break;
            }
            operations = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + input);
    }
}
