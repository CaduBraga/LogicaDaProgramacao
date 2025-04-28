programa
{funcao inicio(){
	real valor, valorDescontado, clienteFidelidade
	escreva ("Digite o valor sem desconto: ")
	leia (valor)
	escreva ("\nDigite 1 para cliente fidelidade. Caso contrário, digite qualquer número: ")
	leia(clienteFidelidade)
valorDescontado = valor - (valor*0.1)

se (clienteFidelidade == 1 e valor > 200){escreva ("\nO valor a ser pago é R$", (valorDescontado))}
	senao {escreva ("\nO valor a ser pago é R$", (valor))}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */