package homework_12.task5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {
    @Test
    void testAddAndGetProduct() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);

        Product laptop = new Product("Ноутбук", 50000, "Электроника");
        service.addProduct(laptop);

        Product retrieved = service.getProductByCategory("Электроника");
        assertEquals(laptop, retrieved);
    }

    @Test
    void testInventoryClosed() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(false);

        Product phone = new Product("Телефон", 30000, "Электроника");
        service.addProduct(phone); // Не должно добавиться

        assertThrows(OutOfStockException.class, () ->
                service.getProductByCategory("Электроника")
        );
    }

    @Test
    void testOutOfStock() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);

        assertThrows(OutOfStockException.class, () ->
                service.getProductByCategory("Несуществующая категория")
        );
    }

    @Test
    void testFilterProducts() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);

        service.addProduct(new Product("Товар1", 100, "Категория1"));
        service.addProduct(new Product("Товар2", 200, "Категория1"));
        service.addProduct(new Product("Товар3", 300, "Категория1"));

        List<Product> filtered = service.filterProducts("Категория1", 200);
        assertEquals(2, filtered.size());
    }
}
