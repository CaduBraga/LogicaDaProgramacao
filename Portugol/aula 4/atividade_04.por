programa
{
funcao inicio()
{
    caractere operacao
    real n1, n2, resultado

    escreva("Digite a operação desejada (+, -, *, /): ")
    leia(operacao)
    escreva("Digite o primeiro número: ")
    leia(n1)
    escreva("Digite o segundo número: ")
    leia(n2)

    escolha (operacao)
    {
        caso "+":
            resultado = n1 + n2
            escreva("Resultado: ", resultado, "
")
            pare
        caso "-":
            resultado = n1 - n2
            escreva("Resultado: ", resultado, "
")
            pare
        caso "*":
            resultado = n1 * n2
            escreva("Resultado: ", resultado, "
")
            pare
        caso "/":
            se (n2 != 0)
                resultado = n1 / n2
            senao
                escreva("Erro: Divisão por zero!
")
            escreva("Resultado: ", resultado, "
")
            pare
        caso contrario:
            escreva("Operação inválida!
")
    }
}
}