# 💳 Sistema de Conta Bancária em Java

## 📌 Descrição

Este projeto é um sistema simples de conta bancária desenvolvido em Java, executado via terminal (CLI). A aplicação permite ao usuário realizar operações básicas como consulta de saldo, depósito e saque por meio de um menu interativo.

O projeto tem como objetivo praticar lógica de programação, controle de fluxo e implementação de regras de negócio em uma aplicação realista.

---

## ✨ Funcionalidades

- 💰 Consultar saldo  
- ➕ Realizar depósitos  
- ➖ Realizar saques  
- 🚪 Encerrar o programa  
- 🔁 Execução contínua com menu interativo  

---

## 🛠️ Tecnologias e Conceitos Utilizados

- Java  
- Programação procedural  
- Lógica de programação  
- Estruturas condicionais (`if`, `switch`)  
- Laços de repetição (`while`)  
- Manipulação de entrada de dados (`Scanner`)  
- Controle de fluxo da aplicação  
- Validação de dados  

---

## 🧠 Regras de Negócio

- Depósitos devem ser maiores que zero  
- Saques devem ser maiores que zero  
- Não é permitido sacar valores maiores que o saldo disponível  

---

## ⚙️ Funcionamento

O sistema apresenta um menu interativo no terminal, onde o usuário pode escolher as operações digitando uma opção numérica.

O programa permanece em execução até que o usuário selecione a opção de saída.

![alt text](image-1.png)



---

## ▶️ Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado  

### Passos

    ```bash
    # Clonar o repositório
    git clone https://github.com/Edimilson-Miranda/Conta-Bancaria

    # Acessar a pasta
    cd Conta-Bancaria

    # Compilar
    javac ContaBancaria.java

    # Executar
    java ContaBancaria

##🧩 Estrutura do Código

    | Método         | Descrição                            |
    | -------------- | ------------------------------------ |
    | `main`         | Controla o fluxo principal e o menu  |
    | `mostrarSaldo` | Exibe o saldo atual                  |
    | `depositar`    | Recebe e valida o valor do depósito  |
    | `sacar`        | Realiza validações e executa o saque |
