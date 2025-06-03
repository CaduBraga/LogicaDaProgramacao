programa
{
    funcao inicio()
    {
        real salarioBruto, imposto, salarioLiquido

        escreva("Digite o valor do salário bruto: ")
        leia(salarioBruto)

        se (salarioBruto <= 1000)
        {
            imposto = 0
        }
        senao se (salarioBruto <= 3000)
        {
            imposto = salarioBruto * 0.10
        }
        senao se (salarioBruto <= 5000)
        {
            imposto = salarioBruto * 0.15
        }
        senao
        {
            imposto = salarioBruto * 0.20
        }

        salarioLiquido = salarioBruto - imposto

        escreval("Imposto a pagar: R$ ", imposto)
        escreval("Salário líquido: R$ ", salarioLiquido)
    }
}