package Lista03;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		
		int numero, contaPar = 0, contaImpar = 0;
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println("Digite o " + i + "° número: ");
			numero = sc.nextInt();
			if(numero % 2 == 0) {
				contaPar++;
			}else {
				contaImpar++;
			}
		}
		System.out.println("Quantidade de pares: " + contaPar
						 + "\nQuantidade de ímpares: " + contaImpar);
		
		sc.close();
	}

}
