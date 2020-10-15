package entities;

public class Banco {
	private final int CONTA;
	private String nome;
	private double saldo;
	
	public Banco(int numConta, String nome, double valorDeposito) {
		super();
		this.CONTA = numConta;
		this.nome = nome;
		this.saldo = valorDeposito;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome += nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public int getConta() {
		return CONTA;
	}
	
	public double deposito(double valorDeposito) {
		return saldo += valorDeposito;
	}
	
	public double saque(double valorSaque) {
		return saldo -= (valorSaque + 5);
	}
	
	
}
