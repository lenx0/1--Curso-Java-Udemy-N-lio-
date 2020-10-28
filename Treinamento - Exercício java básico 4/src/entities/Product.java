package entities;

import java.util.ArrayList;
import java.util.List;

import application.Program;

public class Product {
	private int id;
	private double preco;
	private int quantidade;
	
	

	public Product() {
	}

	public Product(int codigo, double preco, int quantidade) {
		this.id = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return id;
	}

	public void setCodigo(int codigo) {
		this.id = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double precoFinal() {
		
		
	}
	public String toString() {
		return "ID: "+id+", Preço: R$"+preco+", Quantidade: "+quantidade;
	}
}
