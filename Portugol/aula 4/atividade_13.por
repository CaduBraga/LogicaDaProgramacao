programa
{
funcao inicio()
{
    inteiro idade

    escreva("Digite sua idade: ")
    leia(idade)

    se (idade >= 0 e idade <= 12)
        escreva("Criança
")
    senao
        se (idade <= 17)
            escreva("Adolescente
")
        senao
            se (idade <= 60)
                escreva("Adulto
")
            senao
                escreva("Idoso
")
}
}