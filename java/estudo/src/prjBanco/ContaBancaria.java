package prjBanco;

public abstract class ContaBancaria {

	int numero;
	double saldo;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void emiteExtrato() {
		
		System.out.println("Saldo atual da conta R$" + this.saldo);
	}
	
	public double credita() {
		
		return 0;
	}
	
	public double debita() {
		
		return 0;
	}
	
}
