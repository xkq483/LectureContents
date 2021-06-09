public class Review0604Worker implements Runnable {

    private Review0604Counter counter;
    private boolean increment;
    private int count;

    public Review0604Worker(Review0604Counter counter, boolean increment, int count) {
        this.counter = counter;
        this.increment = increment;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            if (increment) {
                this.counter.increment();
                System.out.println("I'm increment");
            } else {
                this.counter.decrement();
                System.out.println("I'm decrement");
            }
        }
    }
}