package homework_8.part_1_functional_interface_lambda.ex_5;

import java.util.function.Consumer;

public class MainForConsumer {
    public static void main(String[] args) {
        Consumer<String> printString = message-> System.out.println("Сообщение: " + message);

        printString.accept("Использование Consumer");
    }
}
