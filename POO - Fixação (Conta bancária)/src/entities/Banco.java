package entities;

public class Banco {
	private final int CONTA;
	private String nome;
	private double saldo;
	
	public Banco(int numConta, String nome) {
		this.CONTA = numConta;
		this.nome = nome;
	}
	
	public Banco(int numConta, String nome, double valorDepositoIni) {
		super();
		this.CONTA = numConta;
		this.nome = nome;
		deposito(valorDepositoIni);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome += nome;
	}
	
	public double getSaldo() { // setSaldo não foi colocado pois ele só pode ser alterado pelo método deposito ou saque!
		return saldo;
	}
	
	
	public int getConta() {
		return CONTA;
	}
	
	public void deposito(double valorDeposito) {//VOID porque o SALDO que está sendo alterado.
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {//VOID PORQUE O SALTO ESTÁ SENDO ALTERADO TAMBÉM.
		saldo -= valorSaque + 5;
	}
	
	
}
