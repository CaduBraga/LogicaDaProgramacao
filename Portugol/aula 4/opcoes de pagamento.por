programa{funcao inicio(){
		inteiro opcao
		real valor, precoAVista, precoComJuros, parcelaCinco, parcelaDez
		faca {

	escreva ("\nDigite o valor total da compra: ")
		leia (valor)
	escreva ("\nDigite o número correspondente ao método de pagamento seguindo a tabela abaixo: \n1 - Pagamento à vista (10% de desconto)\n2 - Parcelamento em 5x sem juros\n3 - Parcelamento em 10x com juros (20%)\n0 - Encerrar o programa\nNúmero escolhido: ")
		leia (opcao)

precoAVista = valor * 0.9
precoComJuros = valor * 1.2
parcelaCinco = valor/5
parcelaDez = precoComJuros/10

		escolha (opcao) {
			caso 1: escreva ("\nO valor final é R$",(precoAVista),"\n")pare
			caso 2: escreva ("\nO valor final é R$",(valor),"\nParcelado em 5 vezes de R$",(parcelaCinco),"\n")pare
			caso 3: escreva ("\nO valor final é R$",(precoComJuros),"\nParcelado em 10 vezes de R$",(parcelaDez),"\n")pare
		
			caso contrario: escreva ("\nOpção inválida!\n")}} enquanto (opcao != 0)}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 950; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */