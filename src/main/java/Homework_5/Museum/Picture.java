package Homework_5.Museum;

public class Picture implements Exhibit{

    @Override
    public void maintainStorageCondition() {
        System.out.println("Картина: нужен контроль за светом и температурой");
    }

    @Override
    public void info() {
        System.out.println("Картина: шедевр живописи конца 18 века.");
    }
}
