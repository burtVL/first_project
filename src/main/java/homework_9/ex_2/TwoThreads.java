package homework_9.ex_2;

public class TwoThreads implements Runnable{

    private char letter;
    private int count;

    public TwoThreads(char letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(letter);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
