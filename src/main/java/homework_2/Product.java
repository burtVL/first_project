package homework_2;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        if (discount > 0 && discount <= 100) {
            price = price * (1 - discount / 100);
        } else {
            System.out.println("Скидка должна быть в диапазоне от 0 до 100");
        }
    }

    public void printInfo() {
        System.out.println("Товар: " + name + ", Цена: " + price + "руб.");
    }
}
