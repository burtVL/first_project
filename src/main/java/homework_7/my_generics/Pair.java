package homework_7.my_generics;

public class Pair<T, U> {

    private T firstItem;
    private U secondItem;

    public T getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(T firstItem) {
        this.firstItem = firstItem;
    }

    public U getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(U secondItem) {
        this.secondItem = secondItem;
    }
}
