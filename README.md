# 💱 Conversor de Moedas em Java

Este projeto é um **conversor de moedas** desenvolvido em **Java**,
utilizando:

-   📡 **API ExchangeRate API** para obter cotações em tempo real\
-   🌐 **HttpClient** (Java 11+) para chamadas HTTP\
-   🔄 **Gson** para desserialização do JSON\
-   🖥️ **Interface via console** com opções de conversão entre moedas.

## 🚀 Tecnologias utilizadas

-   Java 17+
-   HttpClient
-   Gson
-   ExchangeRate API

## 📦 Estrutura do projeto

    src/
     └── modelos/
     │     ├── ApiBuscaCotacao.java
     │     ├── Cotacao.java
     │     ├── ConversionRates.java
     │     └── TelaInicial.java
     └── serviços/
     │     └── Operacoes.java
     └── Main.java

## 🌐 API Utilizada

    https://v6.exchangerate-api.com/v6/SUA-CHAVE-API-AQUI/latest/USD

## 🛠️ Como executar

1.  Clone o repositório\
2.  Abra o projeto em sua IDE\
3.  Execute a classe `Main`

## ▶️ Como usar

O sistema exibe um menu de opções permitindo converter os valores
desejados entre USD, BRL e EUR utilizando a cotação obtida em tempo
real.

## 📄 Licença

Uso livre para fins educacionais.
