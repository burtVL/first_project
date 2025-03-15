package Homework_5.Attraction;

public class Park {
    public void provideAttractionExperience(Attraction attraction) {
        System.out.println("Уникальные ощущения аттракциона: ");
        attraction.provideExperience();
        System.out.println();
    }

    public void maintainAttraction(Attraction attraction) {
        System.out.println("Информация для работников: ");
        attraction.performMaintenance();

    }
}
