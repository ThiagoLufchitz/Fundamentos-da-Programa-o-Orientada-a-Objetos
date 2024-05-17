/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package util;

import java.util.*;

public class InteraceUsuario {
    Scanner sc = new Scanner(System.in);

    public double ValorImovel() {
        while (true) {
            System.out.println("Digite o valor do Imovel? ");
            double valor = Double.parseDouble(sc.nextLine());
            if (valor > 0) {
                return valor;
            }
            System.out.println("Valor Incorreto Digite novamente!");
        }
    }

    public int PrazoFinanciamento() {
        while (true) {
            System.out.println("Digite o valor do Prazo Financiado? ");
            int prazo = Integer.parseInt(sc.nextLine());
            if (prazo > 0) {
                return prazo;
            }
            System.out.println("Valor Incorreto Digite novamente!");
        }
    }

    public double TaxaJurosAnual() {
        while (true) {
            System.out.println("Digite o valor da Taxa de Juros Anual? ");
            double taxa = Double.parseDouble(sc.nextLine());
            if (taxa > 0 && taxa <= 12) {
                return taxa;
            }
            System.out.println("Valor Incorreto Digite novamente!(Entre 1% a 12%)");
        }
    }

}
