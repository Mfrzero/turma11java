package prjBanco;

import java.util.ArrayList;

public class ContaBancaria {

	private int numero;
	private double saldo;
	ArrayList<String> transacoes = new ArrayList<>();
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		System.out.println("Saldo atual da conta R$" + this.saldo);
		return saldo;
	}

	public void emiteExtrato() {
		System.out.println(transacoes.toString());
	}
	
	public double creditar(double valor) {
		if (valor < 0) {
			System.out.println("Transação não aprovada!!!");
			return 0;
		}
		transacoes.add("Creditou R$" + valor);
		return this.saldo += valor;
	}
	
	public double debitar(double valor) {
		if (valor < 0 || valor > saldo) {
			System.out.println("Transação não aprovada!!!");
			return 0;
		}
		transacoes.add("Debitou R$" + valor);
		return this.saldo -= valor;
	}
	
}
