
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }

            String[] pieces = str.split(" ");
            String s = pieces[pieces.length - 1];
            System.out.println(s);
        }
    }
}
