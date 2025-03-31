package homework_7.my_generics;

public class GenericArray {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"one", "two", "three", "four"};

        printArray(intArray);
        printArray(stringArray);

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
    }
}
