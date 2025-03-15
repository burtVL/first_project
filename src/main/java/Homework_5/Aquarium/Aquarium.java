package Homework_5.Aquarium;

public class Aquarium {
    private SeaCreature creature;

    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showCreatureBehavior() {
        creature.move();
    }
}
