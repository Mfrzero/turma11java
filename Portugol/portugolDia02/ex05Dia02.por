programa
{
	//EX05
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o indice de poluição: ")
		leia(indicePoluicao)

		se(indicePoluicao >= 0 e indicePoluicao <= 0.25){
			escreva("Indice aceitavel")
			}
		senao se(indicePoluicao == 0.3){
			escreva("Industrias do 1* grupo devem suspender as atividades")
			}
		senao se(indicePoluicao == 0.4){
			escreva("Industrias do 1* e 2* grupo devem suspender as atividades")
			}
		senao se (indicePoluicao >= 0.5){
			escreva("Industrias de todos os grupos devem paralisar suas atividades")
			}
		senao{
			escreva("Dados invalidos...")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */