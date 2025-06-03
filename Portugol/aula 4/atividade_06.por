programa
{
funcao inicio()
{
    real vendas

    escreva("Digite o total de vendas do mês: R$ ")
    leia(vendas)

    se (vendas < 5000)
        escreva("Desempenho Fraco
")
    senao
        se (vendas <= 10000)
            escreva("Desempenho Regular
")
        senao
            escreva("Desempenho Excelente
")
}
}