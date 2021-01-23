import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split( " "))
                .mapToInt(element ->Integer.parseInt(element)). toArray();
        if (numbers.length < 1){
            System.out.println(0);
            return;
        }
        boolean areEquals = false;
        for (int i = 0; i <numbers.length ; i++) {
        int leftSum = 0;
        int rightSum = 0;
            if (i != 0){

            }
            for (int j = i-1; j >= 0 ; j--) {
                leftSum+=numbers[j];
            }
            for (int j = i + 1; j < numbers.length ; j++) {
                rightSum+=numbers[j];
            }
            if (leftSum == rightSum){
                areEquals = true;
                System.out.println(i);
                break;
            }
        }
        if (!areEquals){
            System.out.println("no");
        }
    }
}
