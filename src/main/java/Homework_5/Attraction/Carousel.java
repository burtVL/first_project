package Homework_5.Attraction;

public class Carousel implements Attraction{
    @Override
    public void provideExperience() {
        System.out.println("Карусель: плавное вращение и наслаждение видами города");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Обслуживание: требует частого ремонта");
    }
}
