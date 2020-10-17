package projetoOO;

public class NotaFiscal extends Produto{

	double total = 0;
	
	for (int i = 0; i < produtos.length; i++) {
		if(carrinho[i]!=0) {
		System.out.println(carrinho[i] + " - " + produtos[i] + " " +  precos[i]);
		total += precos[i]* carrinho[i];
		System.out.println("-----------");
		}
	}
	

}
