
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int fact = 1;

        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
