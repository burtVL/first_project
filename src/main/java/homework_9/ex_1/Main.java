package homework_9.ex_1;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());

        thread.start();
    }
}
