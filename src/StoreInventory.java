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

	public void removeProduct(int id) {
		inventory.remove(id);
	}

	public void updateProductQuantity(int id, int addQuantity) {
		Product product = inventory.get(id);
		if (product != null) {
			product.setQuantity(addQuantity);
		}
	}

	public void viewInventory() {
		for (Product product : inventory.values()) {
			System.out.println("Product: " + product.getName());
			System.out.println("# of items in stock: " + product.getQuantity());
			System.out.println("Price of Product: " + product.getPrice() + "\n");
		}
	}
}
