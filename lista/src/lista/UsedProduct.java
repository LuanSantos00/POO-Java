package lista;

public class UsedProduct extends Product{
	
	public String manufactureDate;
	
	public String priceTag() {
		return this.name + "(used)" + "$ " + this.price + "Manufacture date: " + this.manufactureDate + "\n";
	}
}
