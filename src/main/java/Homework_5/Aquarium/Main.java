package Homework_5.Aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Shark shark = new Shark();
        aquarium.setCreature(shark);
        aquarium.showCreatureBehavior();

        Starfish starfish = new Starfish();
        aquarium.setCreature(starfish);
        aquarium.showCreatureBehavior();
    }
}
