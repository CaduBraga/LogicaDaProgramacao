programa
{funcao inicio(){
	real renda, imposto5, imposto10, imposto15
	escreva ("Digite a sua renda anual: ")
	leia (renda)
imposto5 = renda*0.05
imposto10 = renda*0.1
imposto15 = renda*0.15

se (renda <= 30000){escreva ("O valor do imposto é R$", (imposto5))}
senao se (renda <= 60000){escreva ("O valor a ser pago é R$", (imposto10))}
senao{escreva ("O valor a ser pago é R$", (imposto15))}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */