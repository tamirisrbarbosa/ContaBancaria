# 💸 Sistema Bancário Orientado a Objetos em Java

Projeto desenvolvido como prática de Programação Orientada a Objetos (POO) utilizando Java. A aplicação simula um sistema bancário simples com suporte a contas corrente e poupança, operações básicas e tratamento de exceções personalizadas.

---

## 🎯 Objetivos do Projeto

- Aplicar conceitos de herança, encapsulamento e polimorfismo
- Criar uma estrutura reutilizável e organizada para manipulação de contas
- Trabalhar com exceções personalizadas (`SaldoInsuficienteException`)
- Simular interações bancárias no terminal

---

## ⚙️ Tecnologias e Conceitos

- Java 8+
- Programação Orientada a Objetos (POO)
- Herança e Polimorfismo
- Encapsulamento
- Exceções personalizadas
- Simulação via terminal

---

## 🧠 Funcionalidades

- Criar contas (corrente e poupança)
- Realizar depósitos e saques
- Verificar saldo atual
- Tratar saques com saldo insuficiente com exceção específica
- Simulação completa via terminal

---

## 📁 Estrutura de Arquivos

```
📦 ContaBancaria/
├── ContaBancaria.java # Classe abstrata base
├── ContaCorrente.java # Implementa regra de taxa
├── ContaPoupanca.java # Saque sem taxa
├── SaldoInsuficienteException.java # Exceção personalizada
├── main.java # Simulação das operações
└── README.md
```

---

## 🚀 Como Executar

### Requisitos:
- Java JDK 8 ou superior
- Terminal ou prompt de comando

### Passos:

```
# Compile todos os arquivos
javac *.java

# Execute o programa
java main

```
---

## 🖼️ Demonstração

<img width="643" height="131" alt="image" src="https://github.com/user-attachments/assets/41cb683b-8b94-460c-95af-1887c022c816" />


### 🖥️ Simulação no terminal

```
Deposito de R$500.0 realizado com sucesso       ← Conta Poupança
Saque de R$200.0 realizado com sucesso          ← Operação válida
Saque não permitido: saldo insuficiente.        ← Lógica de exceção personalizada
```

---

## 👩‍💻 Sobre o Projeto
Este projeto foi desenvolvido para a disciplina de Linguagem Orientada a Objetos no curso de Análise e Desenvolvimento de Sistemas (3º período).

---

## 💁‍♀️ Sobre mim
Sou a Tamiris Barbosa, estudante de Análise e Desenvolvimento de Sistemas, com transição de carreira para área de desenvolvimento.

🔗 [LinkedIn](https://www.linkedin.com/in/tamirisrodriguesbarbosa)  
🐙 [GitHub](https://github.com/tamirisrbarbosa)

---

## ✅ Melhorias futuras

- Interface com entrada do usuário
- Persistência de dados com arquivos ´.txt´ ou banco de dados
- Testes unitários






