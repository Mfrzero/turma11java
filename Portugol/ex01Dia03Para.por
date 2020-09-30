programa
{
	inclua biblioteca Matematica --> mat
	//Para EX01
	funcao inicio()
	{
		inteiro quantidadeFilhos, somaFilhos = 0, menosDeCem = 0, pessoas = 3
		real salario, somaSalario = 0, mediaSalario, mediaFilhos, maiorSalario = 0, percentual

		para(inteiro i = 1; i <= pessoas; i++){
			
			escreva("Digite o salario da " + i + "* pessoa: ")
			leia(salario)
			escreva("Digite a quantidade de filhos da " + i + "* pessoa: ")
			leia(quantidadeFilhos)
			
			se(salario > maiorSalario){
				maiorSalario = salario
				}
			se(salario <= 100){
				menosDeCem = menosDeCem + 1
				
				}
			somaSalario = somaSalario + salario
			somaFilhos = somaFilhos + quantidadeFilhos
			
			}
		mediaSalario = somaSalario / pessoas
		mediaFilhos = somaFilhos / pessoas			
		percentual = (menosDeCem * 100) / pessoas

		escreva("Media salarial: R$" + mat.arredondar(mediaSalario, 2)
			 + "\nMedia de filhos: " + mediaFilhos
			 + "\nMaior Salario: R$" + maiorSalario
			 + "\nPercentual de pessoas que rebem ate de RS100,00: " + percentual + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 869; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */