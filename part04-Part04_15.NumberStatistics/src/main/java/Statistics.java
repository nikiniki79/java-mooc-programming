public class Statistics {
    private int number;
    private int count;

    public Statistics() {
        this.number = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.number = this.number + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.number;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        } else {
            double x = (this.number * 1.0) / (this.count * 1.0);
            return x;
        }
    
    }
}
