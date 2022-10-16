
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            String[] pieces = str.split(" ");

            for (String s : pieces) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
            if (str.equals("")) {
                break;
            }
        }
    }
}
