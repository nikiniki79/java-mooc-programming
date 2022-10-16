
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.next();
            if (str.equals("end")) {
                break;
            } else {
                int x = Integer.valueOf(str);
                double y = Math.pow(x, 3);
                System.out.println((int)y);
            }
        }
    }
}
