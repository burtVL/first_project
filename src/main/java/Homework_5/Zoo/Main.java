package Homework_5.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        Zoo zoo = new Zoo();

        zoo.addAnimal(elephant);
        zoo.showCurrentAnimal();

        zoo.addAnimal(bird);
        zoo.showCurrentAnimal();



    }
}
