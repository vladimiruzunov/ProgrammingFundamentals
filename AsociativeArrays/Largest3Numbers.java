import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Largest3Numbers {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .map(s-> Integer.parseInt(s))
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .collect(Collectors.toList());
        for (Integer integer : collect) {
            System.out.print(integer + " ");
        }

    }
}
