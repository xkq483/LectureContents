public class Worker implements Runnable{
    private Counter counter;
    private boolean increment;
    private int count;

    public Worker(Counter counter, boolean increment, int count) {
        this.count = count;
        this.increment = increment;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            if (increment) {
                for (int j = 0; j < 1000; j++) {
                    this.counter.increment();
                    System.out.println("I'm increment"); }
                }else{
                    for (int j = 0; j < this.count; j++) {
                        this.counter.decrement();
                        System.out.println("I'm decrement");
                    }
                }
            }
        }
    }
