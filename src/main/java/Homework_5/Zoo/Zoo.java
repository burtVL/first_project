package Homework_5.Zoo;

public class Zoo {
    private Animal currentAnimal;

    public void addAnimal(Animal animal) {
        this.currentAnimal = animal;
        System.out.println("Животное добавлено в зоопарк");
    }

    public void showAnimal(Animal animal) {
        animal.makeSound();
        animal.move();
    }

    public void showCurrentAnimal() {
        currentAnimal.makeSound();
        currentAnimal.move();
    }
}
