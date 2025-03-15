package Homework_5.Farm;

public class Cow extends FarmAnimal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " пасется на лугу.");
    }

    @Override
    public void performUniqueAction() {
        System.out.println(getName() + " дает молоко.");
    }
}
