programa
{
	
	funcao inicio()
	{
	inteiro anoAtual, anoNascimento, resultado
	escreva ("Digite o ano atual ")
	leia (anoAtual)
	escreva ("Digite o seu ano de nascimento ")
	leia (anoNascimento)
	resultado = anoAtual - anoNascimento

	se (resultado >= 16) {
		escreva ("Poderá votar esse ano")
	} senao {
		escreva ("Não poderá votar esse ano")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */