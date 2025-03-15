package Homework_5.Garden;

public class Main {
    public static void main(String[] args) {
        Plant cactus = new Cactus();
        Plant orchid = new Orchid();

        Garden garden = new Garden();

        garden.takeCareOfPlants(cactus);
        garden.takeCareOfPlants(orchid);
    }

}
