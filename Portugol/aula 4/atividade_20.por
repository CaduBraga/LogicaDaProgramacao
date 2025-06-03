programa
{
funcao inicio()
{
    caractere op
    real n1, n2, resultado

    escreva("Digite a operação (+, -, *, /): ")
    leia(op)
    escreva("Digite o primeiro número: ")
    leia(n1)
    escreva("Digite o segundo número: ")
    leia(n2)

    escolha (op)
    {
        caso "+": resultado = n1 + n2 pare
        caso "-": resultado = n1 - n2 pare
        caso "*": resultado = n1 * n2 pare
        caso "/":
            se (n2 != 0)
                resultado = n1 / n2
            senao
                escreva("Erro: Divisão por zero
")
            pare
        caso contrario: escreva("Operação inválida
")
    }

    escreva("Resultado: ", resultado, "
")
}
}