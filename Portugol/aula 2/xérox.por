programa
{
	
	funcao inicio()
	{
	real codigo, qtd, aluno, professor, direcao, naoAluno
	escreva ("Digite código do cliente: ")
	leia (codigo)
	escreva ("Digite o número de cópias: ")
	leia (qtd)

	aluno = qtd * 0.15
	professor = qtd * 0.07
	direcao = qtd * 0
	naoAluno = qtd * 0.2
	
		se (codigo == 10){escreva ("O valor a ser pago é R$", (aluno))}
		se (codigo == 12){escreva ("O valor a ser pago é R$", (professor))}
		se (codigo == 1){escreva ("O valor a ser pago é R$", (direcao))}
		se (codigo == 15){escreva ("O valor a ser pago é R$", (naoAluno))}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */