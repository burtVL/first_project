package homework_8.part_1_functional_interface_lambda.ex_2;

public class Main {
    public static void main(String[] args) {
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        run1.run();
    }
}
