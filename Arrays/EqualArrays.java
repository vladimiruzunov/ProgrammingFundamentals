import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArrayString = scanner.nextLine();
        String[] firstNumberStrings = firstArrayString.split(" ");
        int[] firstArray= new int[firstNumberStrings.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumberStrings[i]);
        }
        String secondArrayString = scanner.nextLine();
        String[] secondNumberStrings = secondArrayString.split(" ");
        int[] secondArray= new int[secondNumberStrings.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumberStrings[i]);
        }
        boolean areEqual = true;
        int differentAtIndex = -1;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray [i]);
                areEqual = false;
                differentAtIndex = i;
                break;
            }
        }else {
            areEqual = false;
        }
        if (areEqual){
            int sum = 0;
            for (int number : firstArray){
                sum+=number;
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index", differentAtIndex);
        }
    }
}
