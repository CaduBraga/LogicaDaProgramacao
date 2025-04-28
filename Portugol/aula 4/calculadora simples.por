programa {funcao inicio(){
		inteiro operacao
		real valor1, valor2, adicao, subtracao, multiplicacao, divisao
		faca {

	escreva ("Digite o primiero valor: ")
		leia (valor1)
			escreva ("\nDigite o segundo valor: ")
		leia (valor2)
	escreva ("\nDigite o número correspondente a operação que deseja seguindo a tabela abaixo: \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n0 - Encerrar o programa\nOpção escolhida: ")
		leia (operacao)

adicao = valor1+valor2
subtracao = valor1-valor2
multiplicacao = valor1*valor2
divisao = valor1/valor2
		
		escolha (operacao) {
			caso 1: escreva ("\nO resultado é: ",(adicao),"\n")pare
			caso 2: escreva ("\nO resultado é: ",(subtracao),"\n")pare
			caso 3: escreva ("\nO resultado é: ",(multiplicacao),"\n")pare
			caso 4: escreva ("\nO resultado é: ",(divisao),"\n")pare
			caso contrario: escreva ("\nOpção inválida!!\n\n")}} enquanto (operacao != 0)}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */