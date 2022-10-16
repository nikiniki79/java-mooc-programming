
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while(true) {
                String str = scanner.nextLine();
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
