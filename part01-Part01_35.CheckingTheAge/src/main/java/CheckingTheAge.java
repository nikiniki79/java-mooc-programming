
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int x = scan.nextInt();
        if (x < 0 || x > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
