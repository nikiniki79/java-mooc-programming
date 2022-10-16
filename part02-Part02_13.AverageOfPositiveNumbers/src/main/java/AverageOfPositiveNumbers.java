
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int sum = 0;
        // int count = 0;
        // while (true) {
        // int input = Integer.valueOf(scanner.nextLine());

        // if (input == 0) {
        // break;
        // } else if (input > 0) {
        // count += 1;
        // sum += input;
        // }
        // if (input < 0) {
        // System.out.println("Cannot calculate the average");
        // }
        // if (count == 0) {
        // System.out.println("Cannot calculate the average");
        // }

        // }
        // System.out.println((double) sum / count);

        int input = 0;
        double sum = 0;

        while (true) {
            double userInput = scanner.nextDouble();
            // Only add to sum if > 0
            if (userInput > 0) {
                input += 1;
                sum += userInput;
            } else if (userInput == 0) {
                break;
            }

        }
        if (input > 0) {
            System.out.println(sum / input);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
