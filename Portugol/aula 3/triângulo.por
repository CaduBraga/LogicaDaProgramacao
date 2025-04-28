programa
{funcao inicio(){
	inteiro med1, med2, med3, som1, som2, som3
	escreva ("Digite a primeira medida: ")
	leia (med1)
	escreva ("Digite a segunda medida: ")
	leia (med2)
	escreva ("Digite a terceira medida: ")
	leia (med3)
som1 = med1 + med2
som2 = med1 + med3
som3 = med2 + med3

		se (med1 == 0 ou med2 == 0 ou med3 == 0) {escreva ("Não é um triângulo")}
		senao se (som1 > med3){escreva ("É um triângulo")}
		senao se (som2 > med2){escreva ("É um triângulo")}	
		senao se (som3 > med1){escreva ("É um triângulo")}	
		senao{escreva ("Não é um triângulo")}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */