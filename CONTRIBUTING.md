# Guia de Contribuição

Obrigado por considerar contribuir para este projeto educacional de Lógica da Programação! Este repositório é dedicado ao aprendizado e ensino de conceitos fundamentais de programação através de exercícios práticos em Java e Portugol.

## Como Contribuir

### 1. Fork e Clone

1. Faça um fork deste repositório
2. Clone o fork para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/LogicaDaProgramacao.git
   ```

### 2. Crie uma Branch

Crie uma branch para sua contribuição:
```bash
git checkout -b feature/novo-exercicio
```

### 3. Desenvolva

- Mantenha o código limpo e bem documentado
- Siga os padrões de nomenclatura Java/Portugol
- Adicione comentários explicativos quando necessário
- Teste seu código antes de submeter
- Mantenha o foco educacional em mente
- Documente adequadamente novos conceitos

### 4. Commit

Faça commits com mensagens descritivas:
```bash
git commit -m "Adiciona exercício sobre arrays - Lista 03"
```

### 5. Push e Pull Request

1. Faça push para sua branch:
   ```bash
   git push origin feature/novo-exercicio
   ```

2. Crie um Pull Request no GitHub

## Padrões de Código

### Java
- Use nomes descritivos para variáveis e funções
- Mantenha a estrutura main() clara
- Use comentários para explicar lógica complexa
- Organize imports no topo do arquivo
- Teste em diferentes cenários

### Portugol
- Use nomes descritivos para variáveis
- Mantenha a estrutura programa/função clara
- Use comentários para explicar algoritmos
- Organize declarações de variáveis adequadamente
- Teste com diferentes entradas

### Estrutura de Projetos
```
Java/
├── Arrays/
│   ├── Anotações/
│   ├── Atividades/
│   └── Lista03/
├── Estruturas de repetição/
│   ├── Anotações/
│   ├── Atividades/
│   └── Lista 00/
└── Operadores lógicos/
    ├── Lista - If Else/
    └── Lista - Switch Case/

Portugol/
├── aula 1/
├── aula 2/
├── aula 3/
└── aula 4/

Fluxogramas/
├── fluxograma1.png
├── fluxograma2.png
└── fluxograma3/
```

### Comentários
```java
// Exercício: Calcular média de 4 valores
// Objetivo: Aplicar conceitos de entrada/saída e operadores
public class CalculoMedia {
    public static void main(String[] args) {
        // Declaração de variáveis
        double valor1, valor2, valor3, valor4, media;
        
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        
        // Cálculo da média
        media = (valor1 + valor2 + valor3 + valor4) / 4;
        
        // Saída do resultado
        System.out.println("A média é: " + media);
    }
}
```

### Portugol
```portugol
programa
{
    // Exercício: Verificar aprovação do aluno
    // Objetivo: Aplicar estruturas condicionais
    
    funcao inicio()
    {
        inteiro nota1, nota2, nota3, nota4, media
        
        // Entrada de dados
        escreva("Digite a primeira nota: ")
        leia(nota1)
        
        // Cálculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 4
        
        // Verificação de aprovação
        se (media >= 7) {
            escreva("Aluno aprovado!")
        } senao {
            escreva("Aluno reprovado!")
        }
    }
}
```

## Tipos de Contribuição

### 🐛 Correção de Bugs
- Descreva o bug claramente
- Inclua passos para reproduzir
- Teste a correção adequadamente
- Adicione comentários explicativos se necessário
- Verifique se não há problemas de lógica

### ✨ Novos Exercícios
- Explique o objetivo educacional do exercício
- Mantenha consistência com exercícios existentes
- Adicione documentação completa
- Teste o exercício adequadamente
- Considere diferentes níveis de dificuldade

### 📚 Melhorias na Documentação
- Corrija erros de gramática
- Adicione exemplos de uso
- Melhore a clareza das instruções
- Atualize fluxogramas se necessário
- Documente conceitos utilizados

### 🔧 Melhorias de Código
- Refatore código existente
- Melhore a legibilidade
- Adicione comentários explicativos
- Mantenha a funcionalidade
- Documente mudanças

### 📊 Novos Fluxogramas
- Crie fluxogramas claros e legíveis
- Represente algoritmos corretamente
- Use símbolos padrão de fluxograma
- Mantenha consistência visual
- Documente o algoritmo representado

## Processo de Review

1. **Análise de Código**: Seu código será revisado
2. **Testes**: Verifique se funciona corretamente
3. **Educacional**: Confirme se o objetivo educacional é claro
4. **Documentação**: Atualize documentação se necessário
5. **Merge**: Após aprovação, será mergeado

## Diretrizes Educacionais

### Conteúdo
- Mantenha o foco em conceitos de lógica de programação
- Use exemplos práticos e relevantes
- Progrida de forma estruturada (básico → avançado)
- Inclua diferentes abordagens de resolução
- Considere diferentes estilos de aprendizado

### Estrutura
- Organize exercícios por tópicos
- Mantenha nomenclatura consistente
- Use numeração sequencial
- Agrupe exercícios relacionados
- Crie material de apoio quando necessário

### Qualidade
- Teste todos os exercícios
- Verifique se os conceitos estão corretos
- Mantenha código limpo e legível
- Adicione comentários explicativos
- Considere casos edge e validações

## Código de Conduta

- Seja respeitoso e construtivo
- Ajude outros desenvolvedores
- Mantenha o foco educacional do projeto
- Reporte problemas de forma profissional
- Respeite as diretrizes educacionais

## Estrutura de Nomenclatura

### Arquivos Java
- `Anotacoes1.java` - Material teórico
- `Atividade1.java` - Exercícios práticos
- `Questao1.java` - Questões de prova
- `Revisao1.java` - Material de revisão

### Arquivos Portugol
- `atividade_01.por` - Exercícios numerados
- `aprovacao.por` - Exercícios descritivos
- `media.por` - Exercícios por conceito

### Variáveis e Funções
```java
// Constantes em MAIÚSCULAS
final int TAMANHO_ARRAY = 10;
final double NOTA_MINIMA = 7.0;

// Funções em camelCase
public static void calcularMedia() {
    // Cálculo da média
}

// Variáveis descritivas
int quantidadeAlunos = 0;
double mediaTurma = 0.0;
boolean alunoAprovado = false;
```

## Diretrizes Específicas

### Para Exercícios Java
- Use Scanner para entrada de dados
- Implemente validações quando necessário
- Use estruturas de dados apropriadas
- Mantenha código modular
- Adicione tratamento de exceções básico

### Para Exercícios Portugol
- Use estruturas básicas (se, senao, enquanto)
- Mantenha lógica clara e simples
- Use nomes descritivos para variáveis
- Implemente validações básicas
- Foque em conceitos fundamentais

### Para Fluxogramas
- Use símbolos padrão
- Mantenha fluxo lógico claro
- Inclua legendas quando necessário
- Use cores para destacar decisões
- Mantenha consistência visual

## Contato

Para dúvidas ou sugestões:
- Abra uma issue no GitHub
- Entre em contato com o autor
- Consulte a documentação do projeto

---

**Obrigado por contribuir para o aprendizado de programação!** 💻📚
