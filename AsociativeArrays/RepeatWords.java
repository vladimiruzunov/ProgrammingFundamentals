import java.util.Scanner;

public class RepeatWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i <words.length ; i++) {
            String r = repeat(words[i], words[i].length());
            System.out.print(r);
        }
    }

    private static String repeat(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i <count ; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
