import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamPrepEmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digitRegex = "\\d";
        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";

        Pattern patternDigit = Pattern.compile(digitRegex);
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        int sum = 1;
        int coolthreshold = 0;
        List<String> emoji = new ArrayList<>();
        List<String> allEmoji = new ArrayList<>();

        Matcher matcherDigit = patternDigit.matcher(input);
        while (matcherDigit.find()){
            int digit = Integer.parseInt(matcherDigit.group(0));
            sum = sum *digit;
        }
        Matcher matcherEmojis = pattern.matcher(input);
        while (matcherEmojis.find()){
            String name = matcherEmojis.group("name");
            int charSum = 0;
            for (int i = 2; i <name.length() - 2 ; i++) {
               char sign = name.charAt(i);
               charSum+=(int) sign;
            }
            allEmoji.add(name);
            if (charSum>sum){
                emoji.add(name);
            }
        }
        System.out.printf("Cool threshold: %d%n",sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",allEmoji.size());

        for (String a: emoji
        ) {
            System.out.printf("%s%n",a);
        }
    }
}
