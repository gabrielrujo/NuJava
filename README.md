# NuJava - Banco Digital Simplificado

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Projeto desenvolvido para praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java. O sistema simula as operações de um banco digital, agora estruturado com diferentes tipos de contas.

## 📋 Funcionalidades

O sistema permite realizar as seguintes operações:

- **Abertura de Conta:** Criação de contas específicas (Corrente e Poupança).
- **Depósito:** Adicionar valores ao saldo.
- **Saque:** Retirar valores (com validação de saldo suficiente).
- **Transferência:** Enviar dinheiro de uma conta para outra.
- **Consulta:** Verificação de saldo e dados do titular.

## 🛠️ Tecnologias Utilizadas

- **Java JDK** (Versão 17 ou superior)
- **IntelliJ IDEA** (IDE)
- **Git/GitHub** (Versionamento)

## 📚 Aprendizados

Durante a evolução deste projeto, foram aplicados os seguintes conceitos:

- **Classes e Objetos:** Modelagem da entidade bancária.
- **Encapsulamento:** Uso de `private` e Getters/Setters para proteger o saldo.
- **Herança (`extends`):** Reutilização de código da `ContaBancaria` nas classes filhas (`ContaCorrente` e `ContaPoupanca`).
- **Classes Abstratas (`abstract`):** Definição de um modelo base que impede a criação de contas genéricas.
- **Construtores e `super`:** Inicialização correta dos objetos herdados repassando dados para a classe pai.
- **Lógica de Negócio:** Validações de saldo para saques e transferências.

## 🚀 Exemplo de Uso

```java
// Criando contas específicas (Graças à Herança e Abstração)
ContaBancaria c1 = new ContaCorrente("Gabriel Teixeira", 1000.0);
ContaBancaria c2 = new ContaPoupanca("Ana Clara", 500.0);

// Realizando operações
c1.sacar(100.0);
c1.depositar(50.0);

// Transferindo valores entre objetos
c1.transferir(250.0, c2); // Tira da Corrente e manda para a Poupança