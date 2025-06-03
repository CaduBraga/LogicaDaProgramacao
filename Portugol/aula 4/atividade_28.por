programa
{
    funcao inicio()
    {
        real peso, altura, imc

        escreva("Digite seu peso (kg): ")
        leia(peso)

        escreva("Digite sua altura (m): ")
        leia(altura)

        imc = peso / (altura * altura)

        escreval("Seu IMC é: ", imc)

        se (imc < 18.5)
        {
            escreval("Abaixo do peso")
        }
        senao se (imc >= 18.5 && imc <= 24.9)
        {
            escreval("Peso normal")
        }
        senao se (imc >= 25 && imc <= 29.9)
        {
            escreval("Sobrepeso")
        }
        senao
        {
            escreval("Obesidade")
        }
    }
}