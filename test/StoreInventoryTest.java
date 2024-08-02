import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreInventoryTest {

	private StoreInventory storeInventory;
	private Product product1, product2, product3;

	@BeforeEach
	public void setup() {
		storeInventory = new StoreInventory();
		product1 = new Product("Apple", 1, 3.25, 10);
		product2 = new Product("Milk", 2, 4.40, 8);
		product3 = new Product("Candy", 3, 1.20, 20);
	}

	@Test
	public void add_product_to_inventory() {
		storeInventory.addProduct(product1);
		assertEquals(product1, storeInventory.getInventory().get(product1.getId()));
	}

	@Test
	public void add_multiple_products_to_inventory() {
		storeInventory.addProduct(product1);
		storeInventory.addProduct(product3);
		assertEquals(product1, storeInventory.getInventory().get(product1.getId()));
		assertEquals(product3, storeInventory.getInventory().get(product3.getId()));
	}

	@Test
	public void remove_product_in_inventory() {
		storeInventory.addProduct(product1);
		storeInventory.removeProduct(1);
		assertTrue(storeInventory.getInventory().isEmpty());
	}

	@Test
	public void remove_product_from_3_items() {
		storeInventory.addProduct(product1);
		storeInventory.addProduct(product2);
		storeInventory.addProduct(product3);
		storeInventory.removeProduct(2);
		assertEquals(2, storeInventory.getInventory().size());
	}

	@Test
	public void update_quantity_for_product() {
		storeInventory.addProduct(product3);
		storeInventory.updateProductQuantity(product3.getId(), 10);
		assertEquals(30, storeInventory.getInventory().get(product3.getId()).getQuantity());
	}

	@Test
	public void update_quantity_for_multiple_products() {
		storeInventory.addProduct(product2);
		storeInventory.addProduct(product3);
		storeInventory.updateProductQuantity(product2.getId(), 30);
		storeInventory.updateProductQuantity(product3.getId(), 50);
		assertEquals(38, storeInventory.getInventory().get(product2.getId()).getQuantity());
		assertEquals(70, storeInventory.getInventory().get(product3.getId()).getQuantity());
	}

	@Test
	public void view_products_in_inventory() {
		storeInventory.addProduct(product1);
		storeInventory.addProduct(product2);
		storeInventory.viewInventory();
		assertEquals(2, storeInventory.getInventory().size());
	}

	@Test
	public void calculate_total_price_in_inventory() {
		storeInventory.addProduct(product1);
		storeInventory.addProduct(product2);
		assertEquals(67.70, storeInventory.calculateTotalValue());
	}

}
