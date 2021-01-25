import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativeAndRevers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);
        List<Integer> nonNegativeNumbers = new ArrayList<>();
        for (Integer number : numbers) {
           if (number >= 0){
               nonNegativeNumbers.add(number);
           }
        }
        if (nonNegativeNumbers.size()==0){
            System.out.println("empty");
        }else {
            Collections.reverse(nonNegativeNumbers);
            for (Integer nonNegativeNumber : nonNegativeNumbers) {
                System.out.print(nonNegativeNumber + " ");
            }
        }
    }
    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
