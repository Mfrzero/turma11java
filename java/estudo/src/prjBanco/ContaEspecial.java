package prjBanco;

public class ContaEspecial extends ContaCorrente {

	double limite = 0.02;
	// selic 2%

	public void calculaJuros(double valor) {
		valor *= limite;
		System.out.println("Juros de 2% R$" + valor);
	}

	public void mostraOpcoes() {

		System.out.println("Selecione uma op��o");
		System.out.println("-----------------------------------");
		System.out.println("1 - Ver saldo");
		System.out.println("2 - Emitir Extrato");
		System.out.println("3 - Debitar");
		System.out.println("4 - Creditar");
		System.out.println("5 - Pedir tal�o de cheque");
		System.out.println("6 - Calcular Juros");
		System.out.println("0 - Sair");
		System.out.println("-----------------------------------\n");
	}

}
