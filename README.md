# Trabalho de Ambientes e Desenvolvimento de Software - UNIFOR

Este repositório contém o trabalho prático desenvolvido por **Charles Targino** para a cadeira de **Ambientes e Desenvolvimento de Software** na **Universidade de Fortaleza (UNIFOR)**.

O objetivo do projeto é consolidar fundamentos de lógica de programação, estruturas de repetição e manipulação de coleções. Os algoritmos foram implementados em **Java** (executados via terminal) e em **JavaScript** (integrados a páginas Web estruturadas para exibição direta no navegador).

---

## 🛠️ Ambiente de Desenvolvimento

Todo o projeto foi centralizado e desenvolvido utilizando o **Visual Studio Code (VS Code)**, aproveitando o terminal integrado e seu ecossistema para gerenciar tanto os arquivos de backend (Java) quanto as páginas frontend (HTML/JavaScript).

---

## 🚀 Algoritmos Implementados

O projeto traz a resolução de 6 problemas matemáticos e computacionais em ambas as linguagens:

1. **Número Primo**: Validação para identificar se um número inteiro é primo.
2. **Somatório**: Cálculo da soma de um conjunto de valores numéricos.
3. **Fibonacci**: Gerador da sequência de Fibonacci até um termo determinado.
4. **Máximo Divisor Comum (MDC)**: Implementação matemática para encontrar o maior divisor comum entre dois inteiros.
5. **Ordenação**: Algoritmo para organizar um array numérico em ordem crescente.
6. **Contagem**: Algoritmo para identificar e contar elementos dentro de um intervalo ou critério específico.

---

## 📁 Estrutura do Projeto

Os arquivos estão divididos por ambiente dentro do espaço de trabalho do VS Code. Para a parte de JavaScript, cada algoritmo possui uma página HTML correspondente que executa o script:

```text
├── java/
│   ├── NumeroPrimo.java
│   ├── Somatorio.java
│   ├── Fibonacci.java
│   ├── Mdc.java
│   ├── Ordenacao.java
│   └── Contagem.java
│
├── javascript/
│   ├── numero_primo.html
│   ├── somatorio.html
│   ├── fibonacci.html
│   ├── mdc.html
│   ├── ordenacao.html
│   └── contagem.html
│
└── README.md
```

---

## 🏃 Como Executar no VS Code

### Parte 1: Java (Terminal)
* **Pré-requisitos**: Extensão *Extension Pack for Java* instalada no VS Code.
* **Execução**: Abra o arquivo `.java` desejado e clique no botão **Run** que aparece logo acima do método `main` (ou pressione `F5`). O resultado será exibido no terminal do VS Code.

### Parte 2: JavaScript & HTML (`document.write`)
* **Abordagem**: Os códigos em JavaScript foram acoplados a estruturas básicas de HTML. A exibição dos resultados e dados na tela do usuário foi feita utilizando o método nativo `document.write()`.
* **Execução**: 
  1. Clique com o botão direito sobre o arquivo `.html` desejado dentro do VS Code.
  2. Selecione a opção **Open with Live Server** (caso tenha a extensão instalada) ou simplesmente copie o caminho do arquivo (*Copy Path*) e cole na barra de endereço do seu navegador web.

---

## 🎓 Autor

* **Charles Targino**
* Aluno de ADS – UNIFOR
