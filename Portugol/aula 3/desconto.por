programa
{funcao inicio(){
	real valor, valor10, valor5, desconto5, desconto10
	escreva ("Digite o valor sem desconto: ")
	leia (valor)
desconto10 = valor*0.1
desconto5 = valor*0.05
valor10 = valor - desconto10
valor5 = valor - desconto5
	
se (valor > 100){escreva ("O valor a ser pago é R$", (valor10))}
	senao {escreva ("O valor a ser pago é R$", (valor5))}}}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */