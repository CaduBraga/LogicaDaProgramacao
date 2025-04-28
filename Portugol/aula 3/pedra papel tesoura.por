programa
{
	funcao inicio()
	{
	inteiro jogador1, jogador2, resultado
	escreva ("JOGADOR 1 - digite 1 para pedra, 2 para papel ou 3 para tesoura: ")
	leia (jogador1)
	escreva ("JOGADOR 2 - digite 1 para pedra, 2 para papel ou 3 para tesoura: ")
	leia (jogador2)

		se (jogador1 == 1 e jogador2 == 3){ escreva ("JOGADOR 1 VENCEU!")}
		se (jogador1 == 1 e jogador2 == 2){ escreva ("JOGADOR 2 VENCEU!")}
		se (jogador1 == 2 e jogador2 == 1){ escreva ("JOGADOR 1 VENCEU!")}
		se (jogador1 == 2 e jogador2 == 3){ escreva ("JOGADOR 2 VENCEU!")}
		se (jogador1 == 3 e jogador2 == 1){ escreva ("JOGADOR 2 VENCEU!")}
		se (jogador1 == 3 e jogador2 == 2){ escreva ("JOGADOR 1 VENCEU!")}				
		se (jogador1 == 1 e jogador2 == 1){ escreva ("EMPATE!")}
		se (jogador1 == 2 e jogador2 == 2){ escreva ("EMPATE!")}
		se (jogador1 == 3 e jogador2 == 3){ escreva ("EMPATE!")}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */