
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int maxAmount = 100;

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println("First: 0/100\nSecond: 0/100");
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

           if (command.equals("add") && amount > 0) {
                if (firstContainer < maxAmount) {
                    firstContainer += amount;
                } 
                if (firstContainer >= 100) {
                    firstContainer = 100;
                }
           }

            if (command.equals("move") && amount > 0) {
                if (firstContainer - amount >= 0) {
                    firstContainer -= amount;
                    secondContainer += amount;
                    if (secondContainer >= 100) {
                        secondContainer = 100;
                    }
                } else if (firstContainer - amount < 0) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                    if (secondContainer >= 100) {
                        secondContainer = 100;
                    }
                }
            }

            if (command.equals("remove") && amount > 0) {
                if (secondContainer - amount > 0) {
                    secondContainer -= amount;
                } else if (secondContainer - amount < 0) {
                    secondContainer = 0;
                }
            }
            
            System.out.println("First: " + firstContainer + "/100\n" + "Second: " + secondContainer + "/100");
        } 
        scan.close();
    }
}