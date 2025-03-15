package Homework_5.Restaurant;

public class Drink implements Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void describe() {
        System.out.println("Напиток подается объемом " + volume + "мл.");
    }
}
