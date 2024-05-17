/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package main;

import modelo.Financiamento;
import util.InteraceUsuario;

public class Main {
    public static void main(String[] args) {
        double a1, a3, a4;
        int a2;
        InteraceUsuario d1 = new InteraceUsuario();
        a1 = d1.ValorImovel();
        a2 = d1.PrazoFinanciamento();
        a3 = d1.TaxaJurosAnual();
        Financiamento d2 = new Financiamento(a1, a2, a3);
        System.out.println("----------------");

        a4 = d2.PagamentoMensal(a1, a2, a3);
        System.out.println(a4);
        System.out.println(d2.TotaldoPagamento(a4, a2));

    }

}
