package homework_8.part_1_functional_interface_lambda.ex_3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEvenNumbers = x -> x % 2 == 0;

        System.out.println(isEvenNumbers.test(3));
        System.out.println(isEvenNumbers.test(4));
        System.out.println(isEvenNumbers.test(8));

    }
}
