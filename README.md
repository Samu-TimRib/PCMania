# PCMania

Sistema de compras de PCs desenvolvido como exercício prático da disciplina
**C06 - Programação Orientada a Objetos** do Instituto Nacional de Telecomunicações (Inatel).

## Identificação

-- Nome: Samuel Timóteo Ribeiro
-- Matrícula: 634
-- Curso: Eng. de Software

## Sobre o projeto

Simulação de um sistema de loja chamada PC Mania, onde o cliente pode escolher entre 3 promoções de computadores e ao final visualiza o resumo da compra com o valor total.

## Como executar

1. Clone o repositório
2. Abra o projeto em sua IDE (IntelliJ, Eclipse, VS Code...)
3. Localize o arquivo `src/pcmania/Main.java`
4. Altere o valor da variável `MATRICULA` para o seu número de matrícula
5. Execute o `Main.java`

## Estrutura do projeto
```
  PCMania/
  └── src/
      └── pcmania/
          ├── Main.java
          ├── model/
          │   ├── HardwareBasico.java
          │   ├── SistemaOperacional.java
          │   ├── MemoriaUSB.java
          │   ├── Computador.java
          │   └── Cliente.java
          └── util/
              └── ProcessarPedido.java
```

## Uso de Inteligência Artificial

Este projeto utilizou IA como apoio no aprendizado dos conceitos de POO.

- **Modelo utilizado:** Claude Sonnet 4.6 (Anthropic)
- **Prompts utilizados:**
  1. "Preciso cria as estruturas de pastas com base no acessos dos pacotes e da forma mais profissional possivel, poderia me ajudar a separar, nessa parte ainda estou com dúvida de como fazer"
  2. "poderia me explicar porque colocar em pastas assim tipo pra que ter a pcmania/ ou pq de ter o model ou util, por favor, quero entender melhor, por favor"

- **Resultado:** Satisfatório. Com a explicação dela deu muito bem para aprender e entender o motivo dela ter colocado dessa forma, e devo dizer também que a Claude é uma ótima IA para explicar conceitos de IA, passei esses dois prompt também no Gemini e no Chat gpt(todas nas versôes grátis) e a que me deu a resposta mais sastisfatorio e fácil de entender foi a Claude, não devo tirar o valor das outras duas, mas em termos de facilidade o Claude até dessenhou para que eu entendesse.
