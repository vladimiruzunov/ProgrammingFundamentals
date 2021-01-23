import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayAsString = scanner.nextLine();
        String[] numbersAsString = arrayAsString.split(" ");

        int[] arr = new int [numbersAsString.length];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(numbersAsString[i]);
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
