package Homework_5.Pet;

public class Cat extends Pet{
    public Cat() {
        super("влажный корм", "играет");

    }

    @Override
    public void care() {
        System.out.println("Кошка ест " + getFoodType() + " и " + getActivity() + ".");
    }
}
