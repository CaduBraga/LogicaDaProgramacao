programa {funcao inicio(){
		inteiro nota
		cadeia nome
		faca {
			escreva ("\nDigite o nome do aluno: ")
		leia (nome)
			escreva ("Digite a nota do aluno ou digite 11 para encerrar o programa: ")
		leia (nota)
		
		escolha (nota) {
			caso 0: escreva ("\nO aluno ", (nome), " se encontra no Conceito E\n")pare
			caso 1: escreva ("\nO aluno ", (nome), " se encontra no Conceito E\n")pare
			caso 2: escreva ("\nO aluno ", (nome), " se encontra no Conceito E\n")pare
			caso 3: escreva ("\nO aluno ", (nome), " se encontra no Conceito D\n")pare
			caso 4: escreva ("\nO aluno ", (nome), " se encontra no Conceito D\n")pare
			caso 5: escreva ("\nO aluno ", (nome), " se encontra no Conceito D\n")pare
			caso 6: escreva ("\nO aluno ", (nome), " se encontra no Conceito C\n")pare
			caso 7: escreva ("\nO aluno ", (nome), " se encontra no Conceito C\n")pare
			caso 8: escreva ("\nO aluno ", (nome), " se encontra no Conceito B\n")pare
			caso 9: escreva ("\nO aluno ", (nome), " se encontra no Conceito B\n")pare
			caso 10: escreva ("\nO aluno ", (nome), " se encontra no Conceito A\n")pare
	caso contrario:escreva ("\nOpção inválida!\n")}
} enquanto (nota != 11)}}