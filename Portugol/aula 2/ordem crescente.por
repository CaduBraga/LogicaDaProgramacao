programa
{
	
	funcao inicio()
	{
	real Valor1, Valor2, Valor3
	escreva ("Digite o primeiro valor ")
	leia (Valor1)
	escreva ("Digite o segundo valor ")
	leia (Valor2)
	escreva ("Digite o terceiro valor ")
	leia (Valor3)

	escreva ("\nOs três valores em ordem crescente é:")
	
	se ( Valor1 > Valor2 e Valor2 > Valor3) {
		escreva ("\n", Valor3, "\n", Valor2, "\n", Valor1)}
		
	se ( Valor2 > Valor1 e Valor1 > Valor3) {
		escreva ("\n", Valor3, "\n", Valor1, "\n", Valor2)}
		
	se ( Valor3 > Valor1 e Valor1 > Valor2) {
		escreva ("\n", Valor2, "\n", Valor1, "\n", Valor3)}	
		
	se ( Valor3 > Valor2 e Valor2 > Valor1) {
		escreva ("\n", Valor1, "\n", Valor2, "\n", Valor3)}
		
	se ( Valor1 > Valor3 e Valor3 > Valor2) {
		escreva ("\n", Valor2, "\n", Valor3, "\n", Valor1)}

	se ( Valor2 > Valor3 e Valor3 > Valor1) {
		escreva ("\n", Valor1, "\n", Valor3, "\n", Valor2)}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 835; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */