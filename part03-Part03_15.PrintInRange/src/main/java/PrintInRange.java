
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println("The numbers in range [3, 9]");
        printNumbersInRange(list, 3, 9);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int element : numbers) {
            if (element >= lowerLimit && element <= upperLimit) {
                System.out.println(element);
            }
        }
    }
}
