programa
{
	
	funcao inicio()
	{
	real Valor1, Valor2, Valor3, ResultadoA, ResultadoB, ResultadoC
	escreva ("Digite o primeiro valor ")
	leia (Valor1)
	escreva ("Digite o segundo valor ")
	leia (Valor2)
	escreva ("Digite o terceiro valor ")
	leia (Valor3)

	ResultadoA = Valor1 + Valor2
	ResultadoB = Valor1 + Valor3
	ResultadoC = Valor2 + Valor3

escreva ("A soma dos dois maiores números é: ")
	
	se ( Valor1 < Valor2 e Valor2 < Valor3) {
		escreva (ResultadoC)}
		
	se ( Valor2 < Valor1 e Valor1 < Valor3) {
		escreva (ResultadoB)}
		
	se ( Valor3 < Valor1 e Valor1 < Valor2) {
		escreva (ResultadoA)}	
		
	se ( Valor3 < Valor2 e Valor2 < Valor1) {
		escreva (ResultadoA)}
		
	se ( Valor1 < Valor3 e Valor3 < Valor2) {
		escreva (ResultadoC)}

	se ( Valor2 < Valor3 e Valor3 < Valor1) {
		escreva (ResultadoB)}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */