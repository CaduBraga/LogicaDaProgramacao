programa
{
funcao inicio()
{
    caractere tipo
    real valor, desconto, valorFinal

    escreva("Digite o valor total da compra: R$ ")
    leia(valor)
    escreva("Digite o tipo de cliente (R - Regular, V - VIP, F - Funcionário): ")
    leia(tipo)

    escolha (tipo)
    {
        caso "R":
        caso "r":
            desconto = 0
            pare
        caso "V":
        caso "v":
            desconto = valor * 0.10
            pare
        caso "F":
        caso "f":
            desconto = valor * 0.20
            pare
        caso contrario:
            escreva("Tipo de cliente inválido!
")
            desconto = 0
    }

    valorFinal = valor - desconto
    escreva("Desconto: R$", desconto, "
Valor final: R$", valorFinal, "
")
}
}