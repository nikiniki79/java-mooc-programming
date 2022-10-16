public class Gauge {
    private int value;

    public void increase() {
        if (this.value < 5) {
            value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            value -= 1;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        if (this.value == 5) {
            return true;
        } 
        return false;
    }
}
