package homework_3;

public class Main {
    public static void main(String[] args) {
        /*
        Company employee1 = new Company("Быстров Александр", 234);
        Company employee2 = new Company("Федорова Анна", 235);

        Company.printCompanyName();
        System.out.println("Cотрудник " + Company.companyName + ": " + employee1.getEmployeeName() + ", ID: " + employee1.employeeID);
        System.out.println("Cотрудник " + Company.companyName + ": " + employee2.getEmployeeName() + ", ID: " + employee2.employeeID);

        Company.companyName = "ООО Рога и копыта";
        Company.printCompanyName();
        System.out.println("Cотрудник " + Company.companyName + ": " + employee1.getEmployeeName() + ", ID: " + employee1.employeeID);
        System.out.println("Cотрудник " + Company.companyName + ": " + employee2.getEmployeeName() + ", ID: " + employee2.employeeID);

        //employee1.employeeID = 546;


        // Задание №2
        double radius1 = 45.0;
        double radius2 = 34.0;

        System.out.println("Для радиуса = " + radius1 + ":");
        System.out.println("Площадь круга: " + MathConstants.calculateArea(radius1));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(radius1));

        System.out.println("Для радиуса = " + radius2 + ":");
        System.out.println("Площадь круга: " + MathConstants.calculateArea(radius2));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(radius2));
        System.out.println();


        // Задание № 3

        Library book = new Library("Колыбель для кошки", "Курт Воннегут", 1948, "Драма");

        //System.out.println("Доступ к полю из любого места к полю year: " + book.author);
        //System.out.println("Доступ к полю из любого места к полю bookTitle: " + book.getBookTitle());
        */

        //Задание № 4
        /*
        University student1 = new University("Егор Баранов", 345);
        University student2 = new University("Инна Павлова", 346);
        University student3 = new University("Роман Романов", 347);

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        University.changeUniversityName("МГУ и.м. М.И. Ломоносова");

        System.out.println("Название ВУЗа изменили:");
        System.out.println();

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
         */

        //  Задание № 5
        /*
        GameSettings game1 = new GameSettings("Шахматы", 2);
        GameSettings game2 = new GameSettings("Покер", 4);

        game1.printGameStatus();
        game2.printGameStatus();

        GameSettings.setMaxPlayers(7);

        System.out.println("Изменили максимальное количество игроков для всех игр");

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

        System.out.println("Текущее количество игроков превышает максимальное");
        System.out.println();

        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();

        game2.printGameStatus();

         */

        // Задание 6

        Person person1 = new Person("John", "Baranov", "234-45-234");
        Person person2 = new Person("David", "Petrov", "254-65-275");

        person1.printPersonInfo();
        person2.printPersonInfo();
        System.out.println();

        person1.setLastName("Bill");
        person1.setLastName("Clinton");

        System.out.println("Изменили фамилию и имя у объекта person1");
        System.out.println();

        person1.printPersonInfo();
        person2.printPersonInfo();

    }

}
