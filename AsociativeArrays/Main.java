import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOcurences = new TreeMap<>();
        String[] numbersAsStrings = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < numbersAsStrings.length ; i++) {
           double number = Double.parseDouble(numbersAsStrings[i]);
           Integer occurences = numberOcurences.get(number);
           if (occurences==null){
               occurences = 0;
           }
           numberOcurences.put(number,occurences + 1);

        }
        for (Map.Entry<Double, Integer> entry : numberOcurences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
