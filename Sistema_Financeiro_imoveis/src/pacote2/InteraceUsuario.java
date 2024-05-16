package pacote2;

import java.util.*;

public class InteraceUsuario {
    Scanner sc = new Scanner(System.in);

    public double ValorImovel() {
        System.out.println("Digite o valor do Imovel? ");
        return Double.parseDouble(sc.nextLine());
    }

    public int PrazoFinanciamento() {
        System.out.println("Digite o valor do Prazo Financiado? ");
        return Integer.parseInt(sc.nextLine());
    }

    public double TaxaJurosAnual() {
        System.out.println("Digite o valor da Taxa de Juros Anual? ");
        return Double.parseDouble(sc.nextLine());
    }

}
