import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.println("? ");
            String command = scan.nextLine();

            if ("quit".equalsIgnoreCase(command)) {
                break;
            }

            if ("one".equalsIgnoreCase(command)) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                birds.stream()
                        .filter(b -> Objects.equals(b.getName(), name))
                        .findFirst()
                        .ifPresent(System.out::println);
            }

            if ("add".equalsIgnoreCase(command)) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in latin: ");
                String latinName = scan.nextLine();

                birds.add(new Bird(name, latinName, 0));
            }

            if ("observation".equalsIgnoreCase(command)) {
                System.out.println("Bird? ");
                String name = scan.nextLine();

                Bird queriedBird = birds.stream()
                        .filter(b -> Objects.equals(b.getName(), name))
                        .findFirst()
                        .orElse(null);

                if (queriedBird == null) {
                    System.out.println("Not a bird!");
                    continue;
                }

                queriedBird.addObservation();
            }

            if ("all".equalsIgnoreCase(command)) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }
        }
    }
}
