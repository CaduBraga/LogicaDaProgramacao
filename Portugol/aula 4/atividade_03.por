programa
{
funcao inicio()
{
    caractere combustivel
    real valor, desconto, valorFinal

    escreva("Digite o valor do veículo: ")
    leia(valor)

    escreva("Digite o tipo de combustível (A - Álcool, G - Gasolina, D - Diesel): ")
    leia(combustivel)

    escolha (combustivel)
    {
        caso "A":
        caso "a":
            desconto = valor * 0.25
            pare
        caso "G":
        caso "g":
            desconto = valor * 0.21
            pare
        caso "D":
        caso "d":
            desconto = valor * 0.14
            pare
        caso contrario:
            escreva("Combustível inválido!
")
            desconto = 0
    }

    valorFinal = valor - desconto
    escreva("Desconto: R$", desconto, "
Valor final: R$", valorFinal, "
")
}
}