
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        removeLast(strings);
        System.out.println(strings);


    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        String lastNumber = strings.get(strings.size() - 1);
        boolean x = strings.remove(lastNumber);
        System.out.println(x);
    }
}
