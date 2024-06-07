/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package util;

import java.util.*;

public class IntefaceUsuario {
    private Scanner sc;

    // metodo que le valores inseridos pelo usuario
    public IntefaceUsuario() {
        sc = new Scanner(System.in);
    }
    // Metodo para obter o tipo do imovel a ser financiado
    // public double TipoImovel() {
    // while (true) {
    // System.out.println("O Imovel a ser Financiado é: Terreno(1) , Apartamento(2)
    // e Casa(3) ?");
    // int tipo = Integer.parseInt(sc.nextLine());
    // if (tipo > 0) {
    // return tipo;
    // }
    // System.out.println("Valor Incorreto Digite novamente!");
    // }
    // }

    // Metodo para obter o valor do imovel e verificar se é uma valor valido
    public double ValorImovel() {
        double valorimo;
        while (true) {
            System.out.print("Digite o valor do Imovel? ");
            valorimo = sc.nextDouble();
            if (valorimo > 50000) {
                return valorimo;
            }
            System.out.println("Valor Incorreto Digite, novamente!");
        }
    }

    // Metodo publico e obtem os valor de prazo a ser financiado e verifica se sao
    // valores validos
    public int PrazoFinanciamento() {
        int prazo;
        while (true) {
            System.out.print("Digite o valor do Prazo Financiado? ");
            prazo = sc.nextInt();
            if (prazo > 1 && prazo <= 35) {
                return prazo;
            }
            System.out.println("Valor Incorreto !! Digite novamente!(Entre 1 a 35 anos)");
        }
    }

    // metodo publico e obtem os valores da taxa de juros anula e verifica se é
    // maior que 12%
    // Taxa de juros anual de terreno max 12%,para casa e apartamento 11,5%.
    // valor aceitos pelo programa
    public double TaxaJurosAnual() {
        double taxa;
        while (true) {
            System.out.print("Digite o valor da Taxa de Juros Anual? ");
            taxa = sc.nextDouble();
            if (taxa >= 1 && taxa <= 12) {
                return taxa;
            }
            System.out.println("Valor Incorreto !! Digite novamente!(Entre 0.1% a 12%)");
        }
    }

}
