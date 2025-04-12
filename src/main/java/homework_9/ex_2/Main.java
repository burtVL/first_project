package homework_9.ex_2;

public class Main {
    public static void main(String[] args) {

        Runnable printA = new TwoThreads('A', 5);
        Runnable printB = new TwoThreads('B', 5);

        Thread treadA = new Thread(printA);
        Thread treadB = new Thread(printB);

        treadA.start();
        treadB.start();

    }
}
