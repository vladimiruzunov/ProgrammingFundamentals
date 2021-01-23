import java.util.Scanner;

public class EvenAndOddSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] numberAsStrings = line.split(" ");
        int [] numbers = new int[numberAsStrings.length];
        for (int i = 0; i < numbers.length; i++) {
          numbers[i] = Integer.parseInt(numberAsStrings[i]);
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int number : numbers) {
          if (number % 2 == 0){
              sumEven += number;
          }else {
              sumOdd+=number;
          }
        }
        System.out.println(sumEven - sumOdd);
    }
}
