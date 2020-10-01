programa
{
	inclua biblioteca Matematica --> mat
	
	/*Ex08. O custo ao consumidor de um carro novo 
	é a soma do custo de fábrica com a percentagem
	do distribuidor e dos impostos (aplicados ao 
	custo de fábrica). Supondo que a percentagem do
	distribuidor seja de 28% e os impostos de 45%, 
	escrever um sistema que leia o custo de fábrica 
	de um carro e escreva o custo ao consumidor.*/
	funcao inicio()
	{
		real custoFabrica, valorFinal

		escreva("Digite o custo de fábrica do carro: ")
		leia(custoFabrica)
		
		valorFinal = (custoFabrica * 0.28) + (custoFabrica * 0.45)
		valorFinal = valorFinal + custoFabrica
		escreva("O custo ao consumidor de um carro é: ", mat.arredondar(valorFinal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */