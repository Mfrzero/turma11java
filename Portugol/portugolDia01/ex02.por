programa
{
	//ex02
	/*Faça um sistema que leia a idade de uma 
	pessoa expressa em dias e mostre-a expressa 
	em anos, meses e dias.*/

	funcao inicio()
	{
		inteiro anos, meses, dias, tempo = 0
		
		escreva("Digite a idade da pessoa em dias: ")
		leia(tempo)

		anos = tempo / 365
		meses = (tempo % 365) / 30		
		dias = (tempo % 365) % 30
			
		escreva("Anos: " + anos 
		       +"\nMeses: " + meses  
		       +"\nDias: " + dias )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */