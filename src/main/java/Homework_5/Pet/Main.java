package Homework_5.Pet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();

        PetManager petManager = new PetManager();

        petManager.control(dog);
        petManager.control(cat);

    }

}
