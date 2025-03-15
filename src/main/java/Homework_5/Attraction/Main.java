package Homework_5.Attraction;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        Park park = new Park();

        park.provideAttractionExperience(rollerCoaster);
        park.maintainAttraction(rollerCoaster);

        park.provideAttractionExperience(carousel);
        park.maintainAttraction(carousel);
    }
}
