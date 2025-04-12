package homework_9.ex_3;

public class Work {
    public volatile boolean stop = false;

    public void countWork() {
        int counter = 0;
        while (!stop) {
            counter++;
            System.out.println("Счетчик: " + counter);
        }
        System.out.println("Поток остановлен");
    }

    public void stopWork() {
        stop = true;
    }
}
