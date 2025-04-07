package homework_8.part_1_functional_interface_lambda.ex_1;

public class MainForMathOperations {
    public static void main(String[] args) {

        MathOperations add = (a, b) -> a + b;
        MathOperations substract = (a, b) -> a - b;
        MathOperations multiply = (a, b) -> a * b;
        MathOperations divide = (a, b) -> a / b;

        System.out.println(add.apply(23,34));
        System.out.println(substract.apply(23,34));
        System.out.println(multiply.apply(20,30));
        System.out.println(divide.apply(36,6));

    }
}
