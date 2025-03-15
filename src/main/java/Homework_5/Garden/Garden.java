package Homework_5.Garden;

public class Garden {

    public void takeCareOfPlants(Plant plant) {
        System.out.println("Уход за растением:");
        plant.water();
        plant.provideLight();
        plant.performCare();
        System.out.println();
    }
}
