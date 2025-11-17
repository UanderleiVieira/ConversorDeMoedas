package modelos;

import java.util.Scanner;

public class TelaInicial {
    private int opcao = 1;

    public void exibeTela() {
        Scanner sc = new Scanner(System.in);

        while(opcao != 0) {
            System.out.println("**************************************");
            System.out.println("     ###CONVERSOR DE MOEDAS###");
            System.out.println("**************************************\n");
            System.out.println("----------------------------------------------------");
            System.out.println("1 - Dólar americano (USD) -> Real brasileiro (BRL)");
            System.out.println("2 - Real brasileiro (BRL -> Dólar americano (USD)");
            System.out.println("3 - Dólar americano (USD) -> Euro (EUR)");
            System.out.println("4 - Euro (EUR) -> Dólar americano");
            System.out.println("5 - Real brasileiro (BRL) -> Euro (EUR)");
            System.out.println("6 - Euro (EUR) -> Real brasileiro (BRL");
            System.out.println("0 - Para sair ");
            System.out.println("----------------------------------------------------");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            if(opcao < 0 | opcao > 6) {
                System.out.println("Digite um número válido ou 0 para sair!");
            }
            System.out.println("Programa finalizado!");
        }
    }
}
