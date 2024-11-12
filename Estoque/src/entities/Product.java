package entities;

public class Product {
	
	private String name;
	private String cagory;
	private int quantity;
	private double price;
	private String localStok;
	
	public Product() {}

	public Product(String name, String category, int quantity, double price, String localStok) {
		this.name = name;
		this.cagory = category;
		this.quantity = quantity;
		this.price = price;
		this.localStok = localStok;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCagory() {
		return cagory;
	}

	public void setCagory(String cagory) {
		this.cagory = cagory;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLocalStok() {
		return localStok;
	}

	public void setLocalStok(String localStok) {
		this.localStok = localStok;
	}
	
	public void addProduct(Product product) {
		
	}
	
}
