package practice_7.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addOrder("Салат");
        manager.addOrder("Солянка");
        manager.addOrder("Стейк");

        manager.printOrders();

        manager.deleteOrder("Солянка");

        manager.printOrders();
    }
}
