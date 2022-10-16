
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList <Integer> list = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while(scan.hasNextLine()) {
                list.add(scan.nextInt());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }

        int count = 0;
        for(int i : list) {
            if (i >= lowerBound && i <= upperBound) {
                count += 1;
            } 
        }
        System.out.println("Numbers: " + count);

    }

}
