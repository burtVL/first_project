package Homework_5.Farm;

public abstract class FarmAnimal {
    private String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed() {
        System.out.println(name + " накормлена.");
    }

    public void clean() {
        System.out.println("У " + name + " убрано.");
    }

    public abstract void care();

    public abstract void performUniqueAction();
}
