💱 Conversor de Moedas (Java)
📋 Descrição
Este projeto é um Conversor de Moedas simples feito em Java, 
utilizando a ExchangeRate-API para obter taxas de câmbio em 
tempo real. O programa oferece uma interface de linha de comando e foi contruído para o desafio da ONE.

🛠️ Tecnologias Utilizadas
Java
Biblioteca Gson para manipulação de JSON
ExchangeRate-API para obter taxas de câmbio

🚀 Como Executar
Passo 1: Clonar o Repositório
bash
Copiar código
git clone https://github.com/BeahIF/CurrencyConverter/tree/master

Passo 2: Adicionar o Gson
Baixe o arquivo gson-2.8.6.jar aqui e adicione-o ao seu projeto no IntelliJ:

Vá em File > Project Structure.
Clique em Modules > Dependencies.
Adicione o arquivo gson-2.8.6.jar ao projeto.

Passo 3: Configurar a API Key
No arquivo CurrencyConverter.java, substitua SUA-API-AQUI pela sua chave da ExchangeRate-API.

java
Copiar código
private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/";

Passo 4: Executar o Projeto
No IntelliJ IDEA, execute o arquivo Main.java.

📚 Exemplos de Uso
Após executar o programa, você verá um menu interativo como este:

scss
Copiar código
Conversor de Moedas
====================
1) Dólar (USD) -> Peso Argentino (ARS)
2) Peso Argentino (ARS) -> Dólar (USD)
3) Dólar (USD) -> Real Brasileiro (BRL)
4) Real Brasileiro (BRL) -> Dólar (USD)
5) Dólar (USD) -> Peso Colombiano (COP)
6) Peso Colombiano (COP) -> Dólar (USD)
7) Sair
   Escolha uma opção:
   Exemplo de conversão:

rust
Copiar código
Escolha uma opção: 1
Digite o valor a ser convertido: 100
Valor 100.00 USD corresponde ao valor final de -> 17900.00 ARS
📈 Melhorias Futuras
Adicionar suporte para mais moedas.
Melhorar a validação de entrada do usuário.
Implementar tratamento de erros caso a API esteja indisponível.

👩‍💻 Autor
Feito com ❤️ por Beatriz. 😊