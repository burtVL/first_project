package Homework_5.Garden;

public class Orchid implements Plant{
    @Override
    public void water() {
        System.out.println("Орхидея поливается часто.");
    }

    @Override
    public void provideLight() {
        System.out.println("Орхидеи нужна тень");
    }

    @Override
    public void performCare() {
        System.out.println("Специальный уход для орхидеи: нуждается в высокой влажности и тени.");
    }
}
