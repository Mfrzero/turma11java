package aplicacoes;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Matheus");
		nomes.add("Miguel");
//		nomes.remove("Matheus");
//		nomes.remove(1);
//		nomes.clear();
//		System.out.println(nomes.toString()); //Mostra numa array
		System.out.println(nomes.get(0)); // Mostra como mensagem
		System.out.println(nomes.isEmpty()); // Mostra se esta vazio ou não
		System.out.println(nomes.contains("Miguel")); // Verifica se contem ou não o valor
		System.out.println(nomes.size()); // Mostra o tamanho
		System.out.println(nomes.indexOf("Miguel")); // Mostra o index do parametro
		
	}

}
