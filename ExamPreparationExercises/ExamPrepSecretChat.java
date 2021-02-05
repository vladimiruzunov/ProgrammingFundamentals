import java.util.Scanner;

public class ExamPrepSecretChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessegaDecrypter decrypter = new MessegaDecrypter(sc.nextLine());
        String input;
        while (!"Reveal".equals(input = sc.nextLine())){
            decrypter.interpreter(input);
        }
        decrypter.printMessage();
    }
}

class MessegaDecrypter{

    private String msg;

    public MessegaDecrypter(String msg){
        this.msg = msg;
    }

    public void interpreter(String command){

        String[] token = command.split(":\\|:");

        switch (token[0]){
            case "InsertSpace":
                insertSpace(Integer.parseInt(token[1]));
                break;

            case "Reverse":
                cutReverseAndConcat(token[1]);
                break;

            case "ChangeAll":
                replace(token[1], token[2]);
                break;
        }
    }

    public void printMessage(){
        System.out.printf("You have a new text message: %s", msg);
    }

    private void insertSpace(int index){

        msg = msg.substring(0, index) + " " + msg.substring(index);
        System.out.println(msg);
    }

    private void cutReverseAndConcat(String toCut){

        if (msg.contains(toCut)) {
            msg = msg.replaceFirst(toCut, "").concat(new StringBuilder(toCut).reverse().toString());
            System.out.println(msg);
        }
        else {
            System.out.println("error");
        }
    }

    private void replace(String toReplace, String replaceWith){
        msg = msg.replaceAll(toReplace, replaceWith);
        System.out.println(msg);
    }
}
