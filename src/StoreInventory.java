import java.util.HashMap;

public class StoreInventory {
	private final HashMap<Integer, Product> inventory;

	public StoreInventory() {
		inventory = new HashMap<>();
	}

	public void addProduct(Product product) {
		inventory.put(product.getId(), product);
	}

	public HashMap<Integer, Product> getInventory() {
		return inventory;
	}
}
