programa
{
	inclua biblioteca Matematica --> math
	//EX06
	funcao inicio()
	{
		real x1, y1, x2, y2, distancia

		escreva("Digite x1: ")
		leia(x1)
		escreva("Digite y1: ")
		leia(y1)
		escreva("Digite x2: ")
		leia(x2)
		escreva("Digite y2: ")
		leia(y2)

		distancia = math.raiz((math.potencia(x2 - x1, 2.0) + math.potencia(y2 - y1, 2.0)), 2.0)
		
		escreva("A distancia entre os dois pontos é: " + math.arredondar(distancia, 5))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */