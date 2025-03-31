package practice_7.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;

    // создаем конструктор в котором указываем что у нас пустой список заказов new LinkedList<>();
    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }
    // добавлять заказ в конец очереди
    public void addOrder(String order) {
        orders.addLast(order);
    }

    // обрабатывать заказ из начала очереди
    public String getNextOrder() {
        return this.orders.poll();
    }

    //удалять заказ в любом месте очереди
    public void deleteOrder(String order){
        orders.remove(order);
    }

    public void printOrders() {
        System.out.println("Все заказы:");

        //(order -> System.out.println(order));
        orders.forEach(System.out::println);

        System.out.println();
    }

}
