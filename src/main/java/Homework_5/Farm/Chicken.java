package Homework_5.Farm;

public class Chicken extends FarmAnimal{
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " клюет зерно из кормушки.");
    }

    @Override
    public void performUniqueAction() {
        System.out.println(getName() + " несет яйца.");
    }
}
