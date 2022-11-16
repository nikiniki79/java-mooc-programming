import java.util.*;

public class Stack {
    private ArrayList<String> strs;

    public Stack() {
        this.strs = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.strs.isEmpty();
    }

    public void add(String value) {
        this.strs.add(value);
    }

    public ArrayList <String> values() {
        return strs;
    }

    public String take() {
        String result = strs.get(strs.size() - 1);
        strs.remove(result);
        return result;
    }
}
