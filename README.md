# 💸 Projeto de Sistema Bancário em Java

Este projeto foi desenvolvido como prática de orientação a objetos em Java. A ideia foi criar uma estrutura simples de um sistema bancário com contas, exceções personalizadas e herança entre classes.

---

## 📌 Funcionalidades

- Criação de contas bancárias (corrente e poupança)
- Depósitos e saques
- Tratamento de exceção personalizada para saldo insuficiente
- Encapsulamento e herança aplicados de forma prática

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Java (JDK 8+)**
- **Programação Orientada a Objetos**
- Herança
- Polimorfismo
- Encapsulamento
- Exceções personalizadas (`SaldoInsuficienteException`)
- Criação e manipulação de objetos
- Princípios de reutilização de código
- Boas práticas de codificação

---

## 📁 Estrutura do projeto
```
├── ContaBancaria.java
├── ContaCorrente.java
├── ContaPoupanca.java
├── SaldoInsuficienteException.java
├── main.java
└── README.md
```
---

## 📌 O que cada classe faz:
`ContaBancaria.java`: Classe abstrata base com atributos e métodos comuns às contas.

`ContaCorrente.java`: Herda de ContaBancaria e aplica regras específicas para saque com taxa.

`ContaPoupanca.java`: Também herda de ContaBancaria, mas segue regras diferentes (como ausência de taxa).

`SaldoInsuficienteException.java`: Exceção personalizada para impedir saques indevidos.

`main.java`: Onde tudo acontece — simulações de depósitos, saques e visualização de saldo.

---

## ✅ Funcionalidades
Criar contas corrente e poupança com número e titular.

Realizar depósitos e saques.

Verificar saldo.

Tratar saques com saldo insuficiente usando exceção personalizada.

---

## 🧪 Como Executar o Projeto

Siga os passos abaixo para compilar e executar a aplicação no terminal:

### 1. Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal ou prompt de comando configurado

### 2. Compilar os arquivos

Abra o terminal na pasta do projeto e execute: 
`javac *.java`

Isso compilará todos os arquivos `.java` presentes no diretório.

### 3. Executar o programa

Após a compilação, rode o programa com: 
`java main`

---

## 👩‍💻 Sobre o projeto
Este projeto foi desenvolvido para a disciplina de Linguagem Orientada a Objetos, no curso de Análise e Desenvolvimento de Sistemas, no terceiro período.

---

## 💁‍♀️ Sobre mim
Oi! Eu sou a Iris (Tamiris Barbosa) e estou em transição de carreira pra área de desenvolvimento.

Se quiser trocar ideia sobre programação ou tecnologia, bora conversar! 🤝

🔗 [Meu LinkedIn](https://www.linkedin.com/in/tamirisrodriguesbarbosa)

🐙 [Meu GitHub](https://github.com/tamirisrbarbosa)




