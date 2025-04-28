programa {funcao inicio(){
		inteiro opcao
		real valor, descontoAlcool, descontoGasolina, descontoDiesel, valorAlcool, valorGasolina, valorDiesel
		faca {

	escreva ("\n\nCARANGO VEÍCULOS:\nDigite o valor do carro: ")
		leia (valor)
	escreva ("\nDigite o número correspondente ao combustível do carro seguindo a tabela abaixo: \n1 - Álcool \n2 - Gasolina \n3 - Diesel \n0 - Encerrar o programa\n")
		leia (opcao)

descontoAlcool = valor*0.25
descontoGasolina = valor*0.21
descontoDiesel = valor*0.14
valorAlcool = valor - descontoAlcool
valorGasolina = valor - descontoGasolina
valorDiesel = valor - descontoDiesel
		
		escolha (opcao) {
			caso 1: escreva ("\nO valor do desconto é R$",(descontoAlcool), "\nO valor final do carro é R$", (valorAlcool))pare
			caso 2: escreva ("\nO valor do desconto é R$",(descontoGasolina), "\nO valor final do carro é R$", (valorGasolina)) pare
			caso 3: escreva ("\nO valor do desconto é R$",(descontoDiesel), "\nO valor final do carro é R$", (valorDiesel))pare
			caso contrario: escreva ("\nOpção inválida!!\n")}} enquanto (opcao != 0)}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */