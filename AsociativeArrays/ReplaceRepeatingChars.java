import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char previousChar = input.charAt(0);
        sb.append(previousChar);
        for (int i = 1; i <input.length() ; i++) {
            char cuurentChar = input.charAt(i);
            if (previousChar!= cuurentChar){
                sb.append(cuurentChar);
                previousChar = cuurentChar;
            }
        }
        System.out.println(sb);
    }
}
