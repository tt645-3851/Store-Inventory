public class Product {
	private String name;
	private int id;
	private double price;
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

	public void setName(String newName) {
		this.name = newName;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		this.id = newId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int updateQuantity) {
		this.quantity = updateQuantity;
	}

}
