
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int j = size - 1;
        if (size == 1) {
            System.out.print("*");
            System.out.println("");
        } else {
            while (i <= size) {
                printSpaces(j);
                printStars(i);
                j--;
                i++;
            }
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int j = height - 1;

        while (i <= height) {
            printSpaces(j);
            printStars(i * 2 - 1);
            i++;
            j--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
