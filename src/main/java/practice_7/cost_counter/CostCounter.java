package practice_7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив, индекс = номер месяца
    private ArrayList<Double> costsPerMonth;

    public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    // метод добавления занчения по номеру месяца (от 1 до 12) и расходам в этот месяц
    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month-1, costs);
    }
    //метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costsPerMonth.get(month-1);
    }

    // считать месяц с минимальным расходом

    public Double minCostsPerMonth() {
        // здесь вместо getFirst, просто get с доступом к 1-му элементу потому, что в ArrayList нет метода getFirst()
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.get(0));

        costsPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);
                    }
                }
        );
        return min.get();
    }

}
