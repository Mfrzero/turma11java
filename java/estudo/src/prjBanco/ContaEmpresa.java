package prjBanco;

public class ContaEmpresa extends ContaBancaria{

	ContaBancaria cb = new ContaBancaria();
	
	private double limiteEmpresa = 1000;	
	public double total;
	
	public void emprestimoEmpresarial(double valor) {
		
		
		if (valor > limiteEmpresa * 2) {
			System.out.println("Emprestimo de R$" + valor +" não aprovado...");
		}else {
			System.out.println("Emprestimo de R$" + valor +" aprovado");
			this.total += valor;
		}
		
		
	}
	
	public void mostraOpcoes() {

		System.out.println("Selecione uma opção");
		System.out.println("-----------------------------------");
		System.out.println("1 - Ver saldo");
		System.out.println("2 - Emitir Extrato");
		System.out.println("3 - Debitar");
		System.out.println("4 - Creditar");
		System.out.println("5 - Fazer Emprestimo Empresarial");
		System.out.println("0 - Sair");
		System.out.println("-----------------------------------\n");
		System.out.println("Total na conta "+ cb.getSaldo());
	}
}
