import java.util.Scanner;

public class SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int smallerFirst = findSmallerNumber(firstNum, secondNum);
        int smallestNum = findSmallerNumber(smallerFirst, thirdNum);
        System.out.println(smallestNum);

    }
    public static int findSmallerNumber(int a, int b){
        if (a < b){
            return a;
        }
            return b;
    }
}
