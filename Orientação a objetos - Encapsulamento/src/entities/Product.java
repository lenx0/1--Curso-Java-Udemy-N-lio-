package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) { //construtor para obrigar que os valores sejam digitados pelo usuario.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { //construtor SOBRECARGA
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {//permite acessar o valor do produto.
		return price;
	}
	
	public void setPrice(double price) {//permite alterar o valor do produto.
		this.price = price;
	}
	
	public int getQuantity() {//não colocaremos o set pois a quantidade só pode ser alterada por entrada e saída, para proteger a integritade do software.
		return quantity;
	}
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
