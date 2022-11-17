import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String input = scanner.nextLine();

            if (input.contains("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.contains("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String wordToSearch = scanner.nextLine();
                String returnResult = simpleDictionary.translate(wordToSearch);
                if (returnResult == null) {
                    System.out.println("Word " + wordToSearch + " was not found");
                } else {
                    System.out.println(returnResult);
                }
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}
