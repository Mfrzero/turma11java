package prjBanco;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char opc = ' ';		
	
		System.out.println("Selecione uma opção");
		System.out.println("-----------------------------------");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupança");
		System.out.println("3 - Conta Empresa");
		System.out.println("0 - Sair");
		System.out.println("-----------------------------------\n");
		
		opc = sc.next().charAt(0);
		
		switch (opc) {
		case '1': 
			ContaCorrente cr = new ContaCorrente();
			while(opc!='0') {
			cr.mostraOpcoes();
			opc = sc.next().charAt(0);
				switch (opc) {
				case '1': 
					cr.getSaldo();
					break;
				case '2': 
					cr.emiteExtrato();
					break;
				case '3':
					System.out.println("Digite o valor para debitar:");
					cr.debitar(sc.nextDouble());
					break;
				case '4':
					System.out.println("Digite o valor para creditar:");
					cr.creditar(sc.nextDouble());
					break;
				case '5':
					System.out.println("Digite a taloes de cheque?");
					cr.setTalonario(sc.nextInt());
					cr.emiteTalonario();
					break;
				case '6':
					if (cr.getSaldo() > 3000) {
						ContaEspecial ce = new ContaEspecial();
						while(opc != '0') {
						ce.mostraOpcoes();
						opc = sc.next().charAt(0);
						switch (opc) {
							case '1': 
								ce.getSaldo();
								break;
							case '2': 
								ce.emiteExtrato();
								break;
							case '3':
								System.out.println("Digite o valor para debitar:");
								ce.debitar(sc.nextDouble());
								break;
							case '4':
								System.out.println("Digite o valor para creditar:");
								ce.creditar(sc.nextDouble());
								break;
							case '5':
								System.out.println("Digite a taloes de cheque?");
								ce.setTalonario(sc.nextInt());
								ce.emiteTalonario();
								break;
							case '6':
								System.out.println("Calculando juros...");
								ce.calculaJuros(ce.getSaldo());
								break;
							case '0':
								System.out.println("Saindo...");
								break;
							default:
								System.out.println("Código inválido...");
								break;
						}
							}
					}else{
						System.out.println("Saldo não suficiente para ter conta especial, saldo minimo R$3000,00");
					}
					break;
				case '0':
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção Inválida...");
				}
			}
			break;
		case '2': 
			ContaPoupanca cp = new ContaPoupanca();
			
			while(opc!='0') {
				cp.mostraOpcoes();
				opc = sc.next().charAt(0);
					switch (opc) {
					case '1': 
						cp.getSaldo();
						break;
					case '2': 
						cp.emiteExtrato();
						break;
					case '3':
						System.out.println("Digite o valor para debitar:");
						cp.debitar(sc.nextDouble());
						break;
					case '4':
						System.out.println("Digite o valor para creditar:");
						cp.creditar(sc.nextDouble());
						break;
					case '0':
						System.out.println("Saindo...");
						break;
					default:
						System.out.println("Opção Inválida...");
					}
				}
			break;
		case '3': 
			ContaEmpresa ce = new ContaEmpresa();
			System.out.println("Total na conta: " + ce.getSaldo());
			while(opc!='0') {
				ce.mostraOpcoes();
				opc = sc.next().charAt(0);
					switch (opc) {
					case '1': 
						ce.getSaldo();
						break;
					case '2': 
						ce.emiteExtrato();
						break;
					case '3':
						System.out.println("Digite o valor para debitar:");
						ce.debitar(sc.nextDouble());
						break;
					case '4':
						System.out.println("Digite o valor para creditar:");
						ce.creditar(sc.nextDouble());
						break;
					case '5':
						System.out.println("Empresa com R$1000 em conta");
						System.out.println("Qual valor do emprestimo?");
						ce.emprestimoEmpresarial(sc.nextDouble());
						break;
					case '0':
						System.out.println("Saindo...");
						break;
					default:
						System.out.println("Opção Inválida...");
					}
				}
			break;
		case '0': 
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		

	}

}
