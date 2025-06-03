programa
{
    funcao inicio()
    {
        inteiro anoNascimento, idade, anoAtual

        anoAtual = 2025  // Pode ser alterado conforme o ano atual

        escreva("Digite o ano de nascimento: ")
        leia(anoNascimento)

        idade = anoAtual - anoNascimento

        se (idade < 16)
        {
            escreval("Não pode votar.")
        }
        senao se (idade >= 16 && idade < 18)
        {
            escreval("Pode votar, mas não é obrigatório.")
        }
        senao
        {
            escreval("Obrigatório votar.")
        }
    }
}