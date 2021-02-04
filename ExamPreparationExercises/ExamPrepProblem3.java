import java.util.*;

public class ExamPrepProblem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> emailBox = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Statistics")){
            String[] tokens = input.split("->");
            String command = tokens[0];
            String username = tokens[1];
            switch (command){
                case "Add":
                if (emailBox.containsKey(username)){
                    System.out.printf("%s is already registered%n", username);
                }else {
                    emailBox.put(username, new ArrayList<>());
                }
                    break;
                case "Send":
            String email = tokens[2];
            emailBox.get(username).add(email);
                    break;
                case "Delete":
                if (emailBox.containsKey(username)){
                    emailBox.remove(username);
                }else {
                    System.out.printf("%s not found!%n", username);
                }
                    break;
            }

            input=scanner.nextLine();
        }
        System.out.printf("Users count: %d%n", emailBox.size());
        emailBox.entrySet().stream()
                .sorted((f,s)->s.getValue().size() - f.getValue().size())
                .forEach(entry->{
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(email -> System.out.printf(" - %s%n", email));
                });
    }
}
