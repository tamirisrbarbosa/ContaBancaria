📌  PROJETO: SIMULAÇÃO DE CONTA BANCÁRIA

Este repositório contém uma implementação simples de um sistema bancário em Java, utilizando conceitos de Programação Orientada a Objetos (POO), como herança, polimorfismo e tratamento de exceções.
O projeto faz parte dos meus estudos de Java na faculdade, neste semestre.



🛠️ TECNOLOGIAS UTILIZADAS

- Java
  
- Programação Orientada a Objetos (POO)



📜 DESCRIÇÃO

O projeto simula operações bancárias básicas para contas correntes e contas poupança. As funcionalidades incluem:
✔️ Depósito de valores
✔️ Saque com verificação de saldo
✔️ Tratamento de exceções para saldo insuficiente, identificando a conta afetada



📂 ESTRUTURA DO CÓDIGO

main.java → Classe principal que executa os testes das contas.

ContaBancaria.java → Classe abstrata base para contas bancárias.

ContaCorrente.java → Implementação de uma conta corrente.

ContaPoupanca.java → Implementação de uma conta poupança com restrição de saldo mínimo.

SaldoInsuficienteException.java → Exceção personalizada para saldo insuficiente.




🚀 COMO EXECUTAR

Clique no botão "<> Code" no GitHub e selecione "Download ZIP" para baixar o repositório.

Extraia o arquivo ZIP em seu computador e abra a pasta extraída.



📌 EXEMPLO DE SAÍDA

Deposito de R$500 realizado com sucesso  
Saque no valor de: 200 realizado com sucesso.  
[Conta Corrente] Operação falhou devido a saldo insuficiente.
Saque não permitido: saldo insuficiente.  
Deposito de R$300 realizado com sucesso  
Saque no valor de: 700 realizado com sucesso.  
[Conta Poupança] Operação falhou devido a saldo insuficiente.
Saque não permitido: Saldo mínimo de R$ 50,00 necessário!  



📌 Melhorias Futuras

Implementar taxas para saques em conta corrente.

Adicionar um menu interativo para entrada do usuário.

Criar testes unitários para validar as operações.
