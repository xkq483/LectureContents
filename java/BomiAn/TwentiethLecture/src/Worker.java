public class Worker implements Runnable {
    private Counter counter;
    private boolean increment;
    private int count;

    Worker(Counter counter, boolean increment, int count) {
        this.counter = counter;
        this.increment = increment;
        this.count = count;

    }

    public void run() {
        for (int i = 0; i < this.count; i++) {
                    if (increment) {
                    this.counter.increment();
                    System.out.println("Im increment");
                } else {

                        this.counter.decrement();
                        System.out.println("Im decrement");
                    }
            }
    }
}
