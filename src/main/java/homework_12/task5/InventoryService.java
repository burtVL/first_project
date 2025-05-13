package homework_12.task5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {
    private final Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = false;

    /**
     * Открывает/закрывает доступ к складу
     */
    public void setInventoryOpen(boolean isOpen) {
        this.isInventoryOpen = isOpen;
    }

    /**
     * Добавляет продукт на склад, если склад открыт
     */
    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            return; // Игнорируем добавление, если склад закрыт
        }

        inventory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>())
                .add(product);
    }

    /**
     * Получает первый продукт из указанной категории
     * @throws OutOfStockException если категория пуста или не существует
     */
    public Product getProductByCategory(String category) {
        if (!inventory.containsKey(category)) {
            throw new OutOfStockException("Категория " + category + " не найдена");
        }

        List<Product> products = inventory.get(category);
        if (products.isEmpty()) {
            throw new OutOfStockException("В категории " + category + " нет товаров");
        }

        return products.remove(0); // Удаляем и возвращаем первый товар
    }

    /**
     * Фильтрует продукты по категории и максимальной цене
     */
    public List<Product> filterProducts(String category, double maxPrice) {
        if (!inventory.containsKey(category)) {
            return Collections.emptyList();
        }

        return inventory.get(category).stream()
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}
