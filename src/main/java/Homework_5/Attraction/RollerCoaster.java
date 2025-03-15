package Homework_5.Attraction;

public class RollerCoaster implements Attraction{

    @Override
    public void provideExperience() {
        System.out.println("Американские горки: ощущение адреналина и высоких скоростей!");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Обслуживание: требует регулярной проверки безопасности");
    }
}
