programa
{
funcao inicio()
{
    real n1, n2

    escreva("Digite o primeiro número: ")
    leia(n1)
    escreva("Digite o segundo número: ")
    leia(n2)

    se (n1 > n2)
        escreva("O maior número é: ", n1, "
")
    senao
        se (n2 > n1)
            escreva("O maior número é: ", n2, "
")
        senao
            escreva("Os números são iguais.
")
}
}