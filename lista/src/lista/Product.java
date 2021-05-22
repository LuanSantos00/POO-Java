package lista;

public class Product {
	public String name;
	public double price;
	
	
	public String priceTag() {
		return this.name + "$ " + this.price+ "\n";
	}
}
