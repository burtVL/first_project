package Homework_5.Restaurant;

public class Menu {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        HotDish hotDish = new HotDish(60);
        Drink drink = new Drink(300);

        //restaurant.setDish(hotDish);
        restaurant.addDish(hotDish);
        restaurant.showDishDescription();

        restaurant.setDish(drink);
        restaurant.showDishDescription();
    }
}
