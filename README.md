# NuJava - Banco Digital Simplificado

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Projeto desenvolvido para praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java. O sistema simula as operações básicas de uma conta bancária digital.

## 📋 Funcionalidades

O sistema permite realizar as seguintes operações:

- **Abertura de Conta:** Criação de conta com titular e saldo inicial (via Construtor).
- **Depósito:** Adicionar valores ao saldo.
- **Saque:** Retirar valores (com validação de saldo suficiente).
- **Transferência:** Enviar dinheiro de uma conta para outra (interação entre objetos).
- **Consulta:** Verificação de saldo e dados do titular.

## 🛠️ Tecnologias Utilizadas

- **Java JDK** (Versão 17 ou superior)
- **IntelliJ IDEA** (IDE)
- **Git/GitHub** (Versionamento)

## 📚 Aprendizados

Durante o desenvolvimento deste desafio, foram aplicados os seguintes conceitos:

- **Classes e Objetos:** Modelagem da entidade `ContaBancaria`.
- **Atributos e Métodos:** Definição do estado e comportamento da conta.
- **Modificadores de Acesso:** Uso de `private` para proteger os dados (Encapsulamento).
- **Construtores:** Inicialização correta dos objetos com validação.
- **Lógica de Negócio:** Validações com `if/else` para impedir saques maiores que o saldo.

## 🚀 Exemplo de Uso

```java
// Criando contas
ContaBancaria c1 = new ContaBancaria("Gabriel Teixeira", 1000.0);
ContaBancaria c2 = new ContaBancaria("Fernanda Kipper", 0.0);

// Realizando operações
c1.sacar(100.0);
c1.depositar(50.0);

// Transferindo valores entre objetos
c1.transferir(250.0, c2); // Tira de c1 e coloca em c2