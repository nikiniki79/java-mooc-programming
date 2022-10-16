public class Timer {
    private ClockHand hundredthsSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthsSeconds.advance();
        if (this.hundredthsSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredthsSeconds;
    }
}
