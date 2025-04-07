package homework_8.part_1_functional_interface_lambda.ex_4;

import java.util.function.Function;

public class MainForFunction {
    public static void main(String[] args) {

        Function<String, Integer> getLengthString = string->string.length();

        System.out.println("Длина строки: " + getLengthString.apply("Привет!"));
        System.out.println("Длина строки: " + getLengthString.apply("Мир"));
    }
}
