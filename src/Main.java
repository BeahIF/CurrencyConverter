import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();


        while (true) {
            System.out.println("\nConversor de Moedas");
            System.out.println("====================");
            System.out.println("1) Dólar (USD) -> Peso Argentino (ARS)");
            System.out.println("2) Peso Argentino (ARS) -> Dólar (USD)");
            System.out.println("3) Dólar (USD) -> Real Brasileiro (BRL)");
            System.out.println("4) Real Brasileiro (BRL) -> Dólar (USD)");
            System.out.println("5) Dólar (USD) -> Peso Colombiano (COP)");
            System.out.println("6) Peso Colombiano (COP) -> Dólar (USD)");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo... Obrigado por usar o Conversor de Moedas!");
                break;
            }

            String fromCurrency = "";
            String toCurrency = "";

            switch (opcao) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 2:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    break;
                case 6:
                    fromCurrency = "COP";
                    toCurrency = "USD";
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double amount = scanner.nextDouble();

            double rate = converter.getExchangeRate(fromCurrency, toCurrency);
            if (rate != -1) {
                double convertedAmount = amount * rate;
                System.out.printf("Valor %.2f %s corresponde ao valor final de -> %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
            } else {
                System.out.println("Erro ao obter a taxa de câmbio.");
            }
        }


        scanner.close();
    }
}
