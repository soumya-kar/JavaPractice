package corejava;

public class Laptop {
	private int ram;
	private String brand;
	private int price;
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", brand=" + brand + ", price=" + price + "]";
	}
	public Laptop(int ram, String brand, int price) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.price = price;
	}
	
	
	
	
}
