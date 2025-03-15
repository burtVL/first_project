package Homework_5.Museum;

public class Manuscript implements Exhibit{

    @Override
    public void maintainStorageCondition() {
        System.out.println("Манускрипт: нужен контроль за влажностью и температурой");
    }

    @Override
    public void info() {
        System.out.println("Манускрипт: древний текст написанный на пергаменте.");
    }
}
