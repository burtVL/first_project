package homework_9.ex_1;

public class MyRunnable implements Runnable{

    public void run() {
        try {
            for (int i = 0; i < 5; i++ ) {
                System.out.println("Привет из потока!");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Поток был прерван");
        }
    }
}
