import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreInventoryTest {

	private StoreInventory storeInventory;
	private Product product1;

	@BeforeEach
	public void setup() {
		storeInventory = new StoreInventory();
		product1 = new Product("Apples", 1, 3.25, 10);
	}

	@Test
	public void add_product_to_inventory() {
		storeInventory.addProduct(product1);
		assertEquals(product1, storeInventory.getInventory().get(product1.getId()));
	}

}
