import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private ReadDocument readDocument;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.readDocument = new ReadDocument(this.scanner.nextLine());
    }

    public void start() {
        ArrayList<Recipe> listedDocument = this.readDocument.docToRecipe();

        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while(true) {
            System.out.println("Enter command: ");
            String input = this.scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } 

            if (input.equals("list")) {
                for (Recipe line : listedDocument) {
                    System.out.println(line.toString());
                }
                System.out.println("");
            }

            if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String searched = this.scanner.nextLine();
                for (Recipe recipe : listedDocument) {
                    if (recipe.getName().contains(searched)) {
                        System.out.println(recipe.toString());
                    }
                }
            }

            if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int searched = Integer.valueOf(this.scanner.nextLine());
                for (Recipe recipe : listedDocument) {
                    if (recipe.getTime() <= searched) {
                        System.out.println(recipe.toString());
                    }
                }
            }

            if (input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searched = this.scanner.nextLine();
                for (Recipe recipe : listedDocument) {
                    if (recipe.getIngredients().contains(searched)) {
                        System.out.println(recipe.toString());
                    }
                }
            }
        }
    }
}
