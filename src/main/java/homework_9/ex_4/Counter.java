package homework_9.ex_4;

public class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }
}
