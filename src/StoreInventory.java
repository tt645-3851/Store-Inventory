import java.util.HashMap;

public class StoreInventory {
	private final HashMap<Integer, Product> inventory;
	double totalValue;

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

	// Views current inventory and prints total value of current inventory
	public void viewInventory() {
		System.out.println("Current Inventory\n------------------");
		for (Product product : inventory.values()) {
			System.out.println(product);
		}
		System.out.printf("Total Value: $%.2f", calculateTotalValue());
	}

	public double calculateTotalValue() {
		for (Product product : inventory.values()) {
			totalValue += product.getPrice() * product.getQuantity();
		}
		return totalValue;
	}
}
