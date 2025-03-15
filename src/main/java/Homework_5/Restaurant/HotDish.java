package Homework_5.Restaurant;

public class HotDish implements Dish{
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void describe() {
        System.out.println("Горячее блюдо подается при температуре " + temperature + "C.");
    }
}
