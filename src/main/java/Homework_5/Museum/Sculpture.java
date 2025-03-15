package Homework_5.Museum;

public class Sculpture implements Exhibit{
    @Override
    public void maintainStorageCondition() {
        System.out.println("Скульптура: необходима регулярная реставрация.");
    }

    @Override
    public void info() {
        System.out.println("Скульптура Зевса: главный бог в Древней Греции.");
    }

}
