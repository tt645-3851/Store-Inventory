public class Product {
	private final String name;
	private final int id;
	private final double price;
	private int quantity;

	public Product(String name, int id, double price, int quantity) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int updateQuantity) {
		this.quantity += updateQuantity;
	}

	@Override
	public String toString() {
		return "Product: " + name + "\nID: " + id + "\nCurrent Quantity: " + quantity + "\nPrice: $"
				+ String.format("%.2f", price) + "\n";
	}

}
