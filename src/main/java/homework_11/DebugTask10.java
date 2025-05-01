package homework_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        for (String name : new ArrayList<>(names)) {
            if (name.startsWith("A")) {
                names.remove(name);
            }
        }
        System.out.println(names);
    }
}