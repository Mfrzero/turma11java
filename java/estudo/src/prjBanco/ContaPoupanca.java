package prjBanco;

public class ContaPoupanca extends ContaBancaria {

	double juros = 0.0075;
	double corrMonetaria = 0.01;
	int mesAniversario;

	public void aniversarioMes() {

	}

	public void mostraOpcoes() {

		System.out.println("Selecione uma opção");
		System.out.println("-----------------------------------");
		System.out.println("1 - Ver saldo");
		System.out.println("2 - Emitir Extrato");
		System.out.println("3 - Debitar");
		System.out.println("4 - Creditar");
		System.out.println("5 - Mes de aniversario");
		System.out.println("0 - Sair");
		System.out.println("-----------------------------------\n");
	}
}
