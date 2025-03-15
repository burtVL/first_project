package Homework_5.Pet;

public abstract class Pet {
    private String foodType;
    private String activity;

    public Pet(String foodType, String activity) {
        this.foodType = foodType;
        this.activity = activity;
    }

    public String getFoodType() {
        return this.foodType;
    }

    public String getActivity() {
        return  this.activity;
    }

    public abstract void care();
}
