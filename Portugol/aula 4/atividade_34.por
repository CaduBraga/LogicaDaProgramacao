programa
{
    funcao inicio()
    {
        real celsius, fahrenheit, kelvin
        inteiro opcao

        escreva("Digite a temperatura em Celsius: ")
        leia(celsius)

        escreva("Escolha a conversão:\n1 - Fahrenheit\n2 - Kelvin\nOpção: ")
        leia(opcao)

        se (opcao == 1)
        {
            fahrenheit = (celsius * 9 / 5) + 32
            escreval("Temperatura em Fahrenheit: ", fahrenheit)
        }
        senao se (opcao == 2)
        {
            kelvin = celsius + 273.15
            escreval("Temperatura em Kelvin: ", kelvin)
        }
        senao
        {
            escreval("Opção inválida.")
        }
    }
}