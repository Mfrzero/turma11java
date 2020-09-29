programa
{
	//EX02
	funcao inicio()
	{
		real c, n, salario, ex = 0, total = 0

		escreva("Digite o codigo do funcionario: ")
		leia(c)
		escreva("Digite o numero de horas trabalhadas: ")
		leia(n)

		se(n > 50){
			ex = n - 50
			ex = ex * 20
			salario = 50 * 10
			total = salario + ex
			escreva("Salario total: " + total 
				 + "\nSalario excedente: " + ex)
			}
		se(n >= 0 e n <= 50){
			ex = 0
			salario = n * 10
			escreva("Salario total: " + salario 
				 + "\nSalario excedente: " + ex)
			}
		senao{
			escreva("Dados incorretos...")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */