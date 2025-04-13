# 💸 Projeto de Sistema Bancário em Java

Este projeto foi desenvolvido como prática de orientação a objetos em Java. A ideia foi criar uma estrutura simples de um sistema bancário com contas, exceções personalizadas e herança entre classes.

---

## 🧠 Conceitos aplicados

- Programação orientada a objetos (POO)
- Herança e polimorfismo
- Exceções personalizadas (`SaldoInsuficienteException`)
- Criação e manipulação de objetos
- Encapsulamento de atributos
- Princípios de reutilização de código

---

## 📁 Estrutura do projeto

```bash
├── ContaBancaria.java
├── ContaCorrente.java
├── ContaPoupanca.java
├── SaldoInsuficienteException.java
├── main.java
└── README.md
```

## 📌 O que cada classe faz:
ContaBancaria.java: Classe abstrata base com atributos e métodos comuns às contas.

ContaCorrente.java: Herda de ContaBancaria e aplica regras específicas para saque com taxa.

ContaPoupanca.java: Também herda de ContaBancaria, mas segue regras diferentes (como ausência de taxa).

SaldoInsuficienteException.java: Exceção personalizada para impedir saques indevidos.

main.java: Onde tudo acontece — simulações de depósitos, saques e visualização de saldo.

---

## ✅ Funcionalidades
Criar contas corrente e poupança com número e titular.

Realizar depósitos e saques.

Verificar saldo.

Tratar saques com saldo insuficiente usando exceção personalizada.

---

## 🚀 Como executar
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git 
```

2. Compile os arquivos:
```bash
javac *.java
```

3. Execute:
```bash
java main
```

---

## 👩‍💻 Sobre o projeto
Este projeto foi desenvolvido como parte das atividades da disciplina de Linguagem Orientada a Objetos, no curso de Análise e Desenvolvimento de Sistemas, no terceiro período.

---

## 💁‍♀️ Sobre mim
Oi! Eu sou a Iris (Tamiris Barbosa) e tô em transição de carreira pra área de desenvolvimento.

Se quiser trocar ideia sobre programação ou tecnologia, bora conversar! 🤝

🔗 [Meu LinkedIn](https://www.linkedin.com/in/tamirisrodriguesbarbosa)

🐙 [Meu GitHub](https://github.com/tamirisrbarbosa)




