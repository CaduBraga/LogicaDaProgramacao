programa
{
    funcao inicio()
    {
        real temp

        escreva("Digite a temperatura em °C: ")
        leia(temp)

        se (temp < 0)
        {
            escreval("Muito Frio")
        }
        senao se (temp >= 0 && temp <= 15)
        {
            escreval("Frio")
        }
        senao se (temp >= 16 && temp <= 25)
        {
            escreval("Ameno")
        }
        senao se (temp >= 26 && temp <= 35)
        {
            escreval("Quente")
        }
        senao
        {
            escreval("Muito Quente")
        }
    }
}