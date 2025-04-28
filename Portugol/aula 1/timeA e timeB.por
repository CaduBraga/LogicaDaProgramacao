programa
{
	
	funcao inicio()
	{
	inteiro timeA, timeB, resultadoA, resultadoB
	escreva ("Digite o número de gols do Time A ")
	leia (timeA)
	escreva ("Digite o número de gols do Time B ")
	leia (timeB)

resultadoA = timeA - timeB
resultadoB = timeB - timeA

	se (timeA == timeB) {
		escreva ("O resultado foi empate")}

	se (timeA > timeB) {
		escreva ("O vencedor é o Time A, por ", resultadoA) escreva (" gols")} 	
	
	se (timeA < timeB) {
		escreva ("O vencedor é o Time B, por ", resultadoB) escreva (" gols")} 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */