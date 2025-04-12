package homework_9.ex_3;

public class Main {
    public static void main(String[] args) {

        Work work = new Work();

        Thread workerTread = new Thread(()-> work.countWork());
        workerTread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        work.stopWork();
    }
}
