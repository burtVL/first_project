package practice_7.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 3456.4);
        costCounter.addCosts(2, 12456.4);
        costCounter.addCosts(3, 35468.2);
        costCounter.addCosts(4, 124.6);
        costCounter.addCosts(5, 124564.4);




        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }

}
