package entities;

public class Product {
public String name;
public double priece;
public int quantity;

public double totalValueInStock() {
	return priece * quantity;
		
}

public void addProducts (int quantity) {
	
	this.quantity += quantity;
	
}

public void removeProducts(int quantity) {
	
	
	this.quantity -= quantity;
}

	public String toString() {
		return name
				+ ", $ "
				//2 casas decimais
				+ String.format("%.2f", priece)
				+ ", "
				+ quantity
				+ " unitis, Total $ "
				+ String.format("%.2f", totalValueInStock());
	}
}