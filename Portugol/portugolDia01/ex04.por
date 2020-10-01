programa
{
	inclua biblioteca Matematica --> mat
	
	/*Ex04.Escreva um sistema que leia três números 
	inteiros e positivos (A, B, C) e calcule a seguinte 
	expressão:*/
	funcao inicio()
	{
		real a, b, c, d, r, s

		escreva("Digite o valor de A: ")
		leia(a)
		escreva("Digite o valor de B: ")
		leia(b)
		escreva("Digite o valor de C: ")
		leia(c)
		r = a + b
		s = b + c
		r = mat.potencia(r, 2.0)
		s = mat.potencia(s, 2.0)
		d = (r + s) / 2
		escreva("Valor final: " +mat.arredondar(d,3))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */