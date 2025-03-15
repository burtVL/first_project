package Homework_5.Pet;

public class Dog extends Pet{
    public Dog() {
        super("сухой корм", "гуляет");
    }

    @Override
    public void care() {
        System.out.println("Собака ест " + getFoodType() + " и " + getActivity() + ".");
    }
}
