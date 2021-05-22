package lista;

public class ImportedProduct extends Product {
	
	public double customsFee;
	
	public double totalPrice() {
		return this.price + this.customsFee;
	}
	
	public String priceTag() {
		return this.name + " $ " + this.totalPrice() + "(Customs fee: " + this.customsFee + ")" + "\n";
	}
}
