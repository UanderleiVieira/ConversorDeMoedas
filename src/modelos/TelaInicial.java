package modelos;

import serviços.Operacoes;

import java.util.Scanner;

public class TelaInicial implements Operacoes {

    private final ApiBuscaCotacao api = new ApiBuscaCotacao();
    private int opcao = 1;

    @Override
    public void exibeCotacao() {
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            System.out.println("**************************************");
            System.out.println("     ### CONVERSOR DE MOEDAS ###");
            System.out.println("**************************************\n");

            System.out.println("""
                    1 - Dólar americano -> Real brasileiro
                    2 - Real brasileiro -> Dólar americano
                    3 - Dólar americano -> Euro
                    4 - Euro -> Dólar americano
                    5 - Real brasileiro -> Euro
                    6 - Euro -> Real brasileiro
                    0 - Sair
                    """);

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            Cotacao cotacao = api.buscaCotacao();
            ConversionRates rates = cotacao.conversion_rates();

            double usd = rates.USD();
            double brl = rates.BRL();
            double eur = rates.EUR();

            System.out.println("\nValor a converter: ");
            double valor = sc.nextDouble();

            switch (opcao) {
                case 1 -> System.out.println(valor + " USD = " + (valor * brl) + " BRL");
                case 2 -> System.out.println(valor + " BRL = " + (valor / brl) + " USD");
                case 3 -> System.out.println(valor + " USD = " + (valor * eur) + " EUR");
                case 4 -> System.out.println(valor + " EUR = " + (valor / eur) + " USD");
                case 5 -> System.out.println(valor + " BRL = " + (valor / brl * eur) + " EUR");
                case 6 -> System.out.println(valor + " EUR = " + (valor * brl / eur) + " BRL");
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}

