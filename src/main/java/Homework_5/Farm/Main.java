package Homework_5.Farm;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow("Корова");
        FarmAnimal chicken = new Chicken("Курица");

        Farm farm = new Farm();

        farm.takeCareOfAnimal(cow);
        farm.performUniqueAction(cow);

        farm.takeCareOfAnimal(chicken);
        farm.performUniqueAction(chicken);
    }
}
