import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        int heaviest = 0;
        Item returnObj = null;
        for (Item item : items) {
            if (item.getWeight() > heaviest) {
                returnObj = item;
                heaviest = returnObj.getWeight();
            }
        }
        return returnObj;
    }

    public String getItem() {
        String str = "";
        for (Item item : items) {
            str += item;
        }
        return str;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items " + "(" + totalWeight() + " kg)";
    }
}
