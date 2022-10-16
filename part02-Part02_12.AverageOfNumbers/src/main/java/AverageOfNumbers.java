
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sums = 0;
        int nums = 0;
        double avg = 0;
   
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            
            sums += num;
            nums += 1;
            avg = (double) sums / nums;

        }
        System.out.println("Average of the numbers: " + avg);
    }
}
