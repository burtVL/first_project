package Homework_5.Museum;

public class Museum {
    public void maintainExhibit(Exhibit exhibit) {
        System.out.println("Условия хранения экспонатов: ");
        exhibit.maintainStorageCondition();
        System.out.println();
    }

    public void exhibitInfo(Exhibit exhibit) {
        System.out.println("Информация для посетителей:");
        exhibit.info();
        System.out.println();
    }
}
