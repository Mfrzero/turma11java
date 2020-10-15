package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opc = ' ';
		boolean ligado = false;
		boolean desligado = false;
		Scanner sc = new Scanner(System.in);
		
		ProdutoEletronicoEx03 radio = new ProdutoEletronicoEx03(); 
		
		System.out.println("Digite a marca do Rádio: ");
		radio.marca = sc.next();
		System.out.println("Digite a voltagem do Rádio: ");
		radio.voltagem = sc.nextInt();
				
		System.out.println("1 - Ligar \n2 - Desligar \n3 - Aumentar volume \n4 - Diminuir volume \n5 - Radio AM \n6 - Radio FM \n0 - Sair");
		
		do{			
			System.out.println("Digite a opção: ");
			opc = sc.next().charAt(0);
			switch (opc) {
				case '1':
					radio.ligar();
					ligado = true;
					desligado = false;
					break;
				case '2':
					radio.desligar();
					desligado = true;
					break;
				case '3':
					if(desligado == true) {
						System.out.println("Radio Desligado...");
						break;
					}else {
						radio.aumentarVolume();
						break;
					}					
				case '4':
					if(desligado == true) {
						System.out.println("Radio Desligado...");
						break;
					}else {
						radio.diminuirVolume();
						break;
					}
				case '5':
					if(desligado == true) {
						System.out.println("Radio Desligado...");
						break;
					}else {
						radio.radioAm();
						break;
					}
				case '6':
					if(desligado == true) {
						System.out.println("Radio Desligado...");
						break;
					}else {
						radio.radioFm();
						break;
					}
				case '0':
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida...");
					break;
			}
		}while(opc != '0');
		
		System.out.println("Marca: " + radio.marca
						 + "\nVoltagem: " + radio.voltagem);
		
		sc.close();
	}

}
