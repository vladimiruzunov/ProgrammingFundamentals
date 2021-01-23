import java.util.Scanner;

public class ReversedOrderNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length / 2 ; i++) {
            int swapIndex = numbers.length - 1 - i;
            int oldI = numbers[i];
            numbers[i] = numbers[swapIndex];
            numbers[swapIndex] = oldI;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");

        }
    }
}
