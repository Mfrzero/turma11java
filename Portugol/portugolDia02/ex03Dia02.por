programa
{
	inclua biblioteca Matematica --> mat
	//EX03
	funcao inicio()
	{
		inteiro n1,n2,n3,n4,quadradoN1,quadradoN2,quadradoN3,quadradoN4

		escreva("Digite o 1* numero: ")
		leia(n1)
		escreva("Digite o 2* numero: ")
		leia(n2)
		escreva("Digite o 3* numero: ")
		leia(n3)
		escreva("Digite o 4* numero: ")
		leia(n4)

		quadradoN1 = mat.potencia(n1, 2)
		quadradoN2 = mat.potencia(n2, 2)
		quadradoN3 = mat.potencia(n3, 2)
		quadradoN4 = mat.potencia(n4, 2)

		se(quadradoN3 >= 1000){
			escreva(quadradoN3)
			}
		senao{
			escreva("Numero 1: " + n1 + " Quadrado: " + quadradoN1)
			escreva("\nNumero 2: " + n2 + " Quadrado: " + quadradoN2)
			escreva("\nNumero 3: " + n3 + " Quadrado: " + quadradoN3)
			escreva("\nNumero 4: " + n4 + " Quadrado: " + quadradoN4)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */