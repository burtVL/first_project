package Homework_5.Restaurant;

public class Restaurant {
    private Dish dish;
    private Dish currentDish;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void addDish(Dish currentDish) {
        this.dish = currentDish;
        System.out.println("Блюдо добавлено");
    }

    public void showDishDescription() {
        dish.describe();
    }
}
