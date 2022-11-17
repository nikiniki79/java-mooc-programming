import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + suitcasesTotalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int suitcasesTotalWeight() {
        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            System.out.println(suitcase.getItem());
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases " + suitcasesTotalWeight() + " kg)";
    }
}
