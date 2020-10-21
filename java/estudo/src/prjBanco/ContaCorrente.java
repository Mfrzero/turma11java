package prjBanco;

public class ContaCorrente extends ContaBancaria {

	private int talonario;

	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}

	public void emiteTalonario() {
		System.out.println("Emitindo " + getTalonario() + " talões cheques...");
	}

	public void mostraOpcoes() {

		System.out.println("Selecione uma opção");
		System.out.println("-----------------------------------");
		System.out.println("1 - Ver saldo");
		System.out.println("2 - Emitir Extrato");
		System.out.println("3 - Debitar");
		System.out.println("4 - Creditar");
		System.out.println("5 - Emitir talão de cheque");
		System.out.println("6 - Verifica se pode ter conta especial");
		System.out.println("0 - Sair");
		System.out.println("-----------------------------------\n");
	}
}
