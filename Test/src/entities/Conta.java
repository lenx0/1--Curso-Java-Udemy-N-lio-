package entities;

import java.util.Date;

public class Conta {
	private int numero;
	private double saldo;

	Date date = new Date();
	public Conta() {
		
	}


	public Conta(int numero, int saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void depositoIni(double depIni) {
		this.saldo = depIni;
	}

	public void saque(double valorSaque) {
		saldo -= valorSaque;
		
		System.out.println("Data: "+date);
		System.out.println("Saque realizado: R$"+valorSaque);
		System.out.println("Saldo atualizado: R$"+saldo);
	}
	
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Data: "+date);
		System.out.println("Saque realizado: R$"+valorDeposito);
		System.out.println("Saldo atualizado: R$"+saldo);
	}
	
}
