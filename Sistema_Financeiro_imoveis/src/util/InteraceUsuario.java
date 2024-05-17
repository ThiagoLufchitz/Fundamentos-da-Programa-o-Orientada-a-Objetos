/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package util;

import java.util.*;

public class InteraceUsuario {
    // metodo que le valores inseridos pelo usuario
    Scanner sc = new Scanner(System.in);

    // metodo para obter o valor do imovel e verificar se é uma valor valido
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

    // metodo publico e obtem os valor de prazo a ser financiado e verifica se sao
    // valores validos
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

    // metodo publico e obtem os valores da taxa de juros anula e verifica se e
    // valor aceitos pelo programa
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
