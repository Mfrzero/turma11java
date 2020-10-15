package aplicacoes;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, cont2 = 0;
		double precoNormal = 0, precoFinal = 0, duasVezes = 0, tresVezes = 0;
		char opc;
		
		do{
			if(cont2 == 0){
				System.out.println("Digite o preço do produto: ");;
				precoNormal = sc.nextDouble();
				cont2++;
			}
			else{
				System.out.println("Digite um preço do válido: ");
				precoNormal = sc.nextDouble();
				}
		}while(precoNormal <= 0);
		
		System.out.println("\n        Tabela de pagamento");
		System.out.println("\n-----------------------------------");
		System.out.println("\n1 - À vista em dinheiro ou cheque");
		System.out.println("\n\n2 - À vista no cartão de crédito");
		System.out.println("\n\n3 -      Em duas vezes");
		System.out.println("\n\n4 -      Em três vezes");
		System.out.println("\n-----------------------------------\n");
		
		do{

			if(cont == 0){
				System.out.println("\n\nEscolha a condição de pagamento: ");
				opc = sc.next().charAt(0);
				cont++;
			}else{
				System.out.println("\n\nEscolha a condição de pagamento válida: ");
				opc = sc.next().charAt(0);
				}
				switch(opc){
					
				case '1':
						 precoFinal = precoNormal - (precoNormal * 0.2);
						 break;
				case '2':
						 precoFinal = precoNormal - (precoNormal * 0.15);
						 break;
				case '3':
						 precoFinal = precoNormal;
						 duasVezes = precoNormal / 2;
						 break;
				case '4':
						 precoFinal = precoNormal + (precoNormal * 0.1);
						 tresVezes = precoFinal / 3;
						 break;
				default:
						System.out.println("\nEscolha uma opção de pagamento válida...");
						break;
					}
		}while(opc != '1' && opc != '2' && opc != '3' && opc != '4');
		
		if(opc == '1' || opc == '2'){
			System.out.println("\nPreço final: R$" + precoFinal);
			}
		else if(opc == '3'){
			System.out.println("\nPreço final: R$" + precoFinal 
				 + "\nCom duas parcelas de: R$" + duasVezes);
			}
		else{
			System.out.println("\nPreço final: R$" + precoFinal 
				 + "\nCom três parcelas de: R$" + tresVezes);
				}
		sc.close();
	}

}
