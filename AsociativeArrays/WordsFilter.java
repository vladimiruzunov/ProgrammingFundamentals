import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordsFilter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> filtered = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .filter(w-> w.length() % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(String.join(System.lineSeparator(), filtered));
    }
}
