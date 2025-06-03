programa
{
    funcao inicio()
    {
        cadeia funcaoUsuario

        escreva("Digite sua função (Admin, Gerente, Funcionário): ")
        leia(funcaoUsuario)

        // Convertendo para minúsculo para evitar problemas de digitação
        funcaoUsuario = minuscula(funcaoUsuario)

        se (funcaoUsuario == "admin")
        {
            escreval("Nível de acesso 3 (Acesso completo).")
        }
        senao se (funcaoUsuario == "gerente")
        {
            escreval("Nível de acesso 2 (Acesso limitado, mas pode gerenciar usuários).")
        }
        senao se (funcaoUsuario == "funcionário" || funcaoUsuario == "funcionario")
        {
            escreval("Nível de acesso 1 (Acesso restrito, apenas pode consultar informações).")
        }
        senao
        {
            escreval("Função não reconhecida.")
        }
    }
}
