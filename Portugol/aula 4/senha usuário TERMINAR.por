programa{funcao inicio(){
		
		cadeia nome, senha
		faca {

	escreva ("\nInsira o nome do usuário: ")
		leia (nome)
	escreva ("\nInsira sua senha ou digite CANCELAR para encerrar o programa: ") 
		leia (senha)

//se (senha == nome){escreva ("A senha deve ser diferente do nome de usuário, tente novamente")}

			caso (nome == senha): escreva ("A senha deve ser diferente do nome de usuário, tente novamente")pare
			caso contrario: escreva ("\nAcesso liberado\n")}} enquanto (senha != CANCELAR)}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 496; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */