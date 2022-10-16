
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);

            if (age > oldest) {
                name = pieces[0];
                oldest = age;
            }
        }
        System.out.println("Age of oldest: " + name);
    }
}
