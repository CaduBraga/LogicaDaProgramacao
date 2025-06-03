programa
{
    funcao inicio()
    {
        real valor

        escreva("Digite o valor do produto: ")
        leia(valor)

        se (valor < 50)
        {
            escreval("Categoria: Econômico")
        }
        senao se (valor >= 50 && valor <= 150)
        {
            escreval("Categoria: Médio")
        }
        senao
        {
            escreval("Categoria: Premium")
        }
    }
}