programa
{
	//EX01
	funcao inicio()
	{
		inteiro  ex
		real p, m

		escreva("Digite o peso dos tomates em kilos: ")
		leia(p)

		se(p > 50){
			ex = p - 50
			m = ex * 4
			escreva("O valor da multa é : R$" + m)
			}
		senao{
			m = 0
			escreva("João não tem que pagar nenhuma multa : R$" + m)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */