programa
{
	//ex01
	funcao inicio()
	{
		inteiro anos, meses, dias, total = 0
		
		escreva("Digite os anos: ")
		leia(anos)
		escreva("Digite os meses: ")
		leia(meses)
		escreva("Digite os dias: ")
		leia(dias)

		total = ((anos*365)+(meses*30)+dias)
		
		
		escreva("A pessoa viveu " + total + " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 76; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */