import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamPrepFancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(@#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                Pattern patternDigit = Pattern.compile("\\d");
            matcher = patternDigit.matcher(input);
            String result = "";
            while (matcher.find()){
                result += matcher.group();
            }
            if (result.equals("")){
                result = "00";
            }
                System.out.println("Product group: " + result);

            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
