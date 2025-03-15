package Homework_5.Farm;

public class Farm {
    public void takeCareOfAnimal (FarmAnimal farmAnimal) {
        System.out.println("Уход за " + farmAnimal.getName() + ":");
        farmAnimal.feed();
        farmAnimal.clean();
        farmAnimal.care();

    }

    public void performUniqueAction(FarmAnimal farmAnimal) {
        System.out.println("Уникальные действия для  " + farmAnimal.getName() + ":");
        farmAnimal.performUniqueAction();
    }
}
