import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] train = new int[n];
        int people = 0;
        for (int i = 0; i < n ; i++) {
         train[i] = Integer.parseInt(scanner.nextLine());
         people+=train[i];
        }
        for (int i = 0; i < train.length ; i++) {
            System.out.print(train[i] + " ");

        }
        System.out.println();
        System.out.println(people);
    }
}
