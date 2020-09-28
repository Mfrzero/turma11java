programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		inteiro anoNascimento
		real salarioUsuario
	
		inteiro idade
		escreva("Digite o nome do usuário: ")
		leia(nomeUsuario)
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)
		escreva("Digite o salário: ")
		leia(salarioUsuario)
		
		idade = 2020 - anoNascimento 
		escreva("Oi meu nome é " + nomeUsuario
			 + " nasci em " + anoNascimento
			 + " tenho um salário de: " + salarioUsuario
			 + " tenho" + idade + " anos")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */