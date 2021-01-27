import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    private static int[] readArray(Scanner scanner) {
        String line = scanner.nextLine();
        String [] numbersAsStrings = line.split(" ");
        int[] array = new int[numbersAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsStrings[i]);
        }
        return array;
    }


    private static void printLineOfNumbersIncreasing(int maxNumber) {
        for (int i = 1; i <=maxNumber ; i++) {
            System.out.print(i + " ");
        }

    }
    static void printArray (int[] array){
        for (int number: array) {
            System.out.print(number + " ");
        }
    }
}
