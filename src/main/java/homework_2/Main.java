package homework_2;

public class Main {
    public static void main(String[] args) {
        // Задание № 1
        Car car = new Car("Toyota",2015);

        car.print();

        car.setYear(2018);

        car.print();
        // Задание № 2
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        rectangle.setWidth(40);

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        // Задание № 3
        Book book = new Book("Гарри Поттер", "Джоан Роулинг");

        book.printInfo();

        book.setAuthor("Райан Гослинг");

        book.printInfo();

        // Задание № 4
        BankAccount bankAccount = new BankAccount("Бурлаков АРтем", 30000);

        bankAccount.printBalance();

        bankAccount.deposit(1000);

        bankAccount.printBalance();

        bankAccount.widthdraw(29000);

        bankAccount.printBalance();

        bankAccount.widthdraw(3000);

        bankAccount.printBalance();

        // Задание № 5

        Point point = new Point(20, 45);

        point.print();

        point.setX(50);

        point.print();

        // Задание № 6

        StudentGroup studentGroup = new StudentGroup("QA", 41 );

        studentGroup.printInfo();

        studentGroup.setGroupName("AQA");
        studentGroup.setStudentCount(39);

        studentGroup.printInfo();

        // Задание № 7

        Circle circle = new Circle(40.5);

        System.out.println("Радиус: " + circle.radius);

        circle.setRadius(67.56);

        System.out.println("Площадь круга: " + circle.calculateArea());

        System.out.println("Длина окружности: " + circle.calculateCircumference());

        // Задание № 8

        Techer techer = new Techer("Анна Петрова", "Биология");

        techer.printInfo();

        techer.setName("Елизваета Сидорова");
        techer.setSubject("Математика");

        techer.printInfo();

        //Задание № 9

        Product product = new Product("Виски", 5698.50);

        product.printInfo();

        product.setPrice(6000);
        product.printInfo();

        product.applyDiscount(20);
        System.out.println("Скидка применилась:");
        product.printInfo();

        product.applyDiscount(120);

        // Задание № 10

        Laptop laptop = new Laptop("HP", 120000);

        laptop.printInfo();

        laptop.setPrice(145000.50);

        laptop.printInfo();

    }
}
