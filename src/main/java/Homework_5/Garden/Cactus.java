package Homework_5.Garden;

public class Cactus implements Plant{

    @Override
    public void water() {
        System.out.println("Кактус поливается редко");
    }

    @Override
    public void provideLight() {
        System.out.println("Кактус получает много света");
    }

    @Override
    public void performCare() {
        System.out.println("Специальный уход для кактуса: много света и редкий полив.");
    }
}
