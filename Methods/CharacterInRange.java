import java.util.Scanner;

public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printCharacterInRange(first, second);

    }

    public static void printCharacterInRange(char first, char second) {
        if (first < second) {
            for (char i = (char) (first + 1); i < second; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (second + 1); i < first; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
