programa
{
    funcao inicio()
    {
        real valorCompra

        escreva("Digite o valor da compra: ")
        leia(valorCompra)

        se (valorCompra < 100)
        {
            escreval("Desconto de 5%")
        }
        senao
        {
            escreval("Desconto de 10%")
        }
    }
}