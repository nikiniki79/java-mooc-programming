import java.util.Scanner;

public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scan;

    public UserInterface(Container firsContainer, Container secondContainer, Scanner scan) {
        this.firstContainer = firsContainer;
        this.secondContainer = secondContainer;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            if (command.equals("add")) {
                this.firstContainer.add(amount);
            }

            if (command.equals("move")) {
                if (this.firstContainer.contains() - amount >= 0) {
                    this.firstContainer.remove(amount);
                    this.secondContainer.add(amount);
                } else {
                    int move = this.firstContainer.contains();
                    this.firstContainer.remove(this.firstContainer.contains());
                    this.secondContainer.add(this.firstContainer.contains() + move);
                }
            }

            if (command.equals("remove")) {
                this.secondContainer.remove(amount);
            }
        }
        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);
    }
}
