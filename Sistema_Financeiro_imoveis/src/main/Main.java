/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package main;

import java.util.ArrayList;

import modelo.Financiamento;
import util.InteraceUsuario;

public class Main {
    public static void main(String[] args) {
        InteraceUsuario interaceUsuario = new InteraceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Solicitando quato imoveis para o usuario
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite os Dados do " + i + "° Imovel :");
            double ValorImovel = interaceUsuario.ValorImovel();
            int prazoFinanciamento = interaceUsuario.PrazoFinanciamento();
            double taxaJurosAnual = interaceUsuario.TaxaJurosAnual();
            System.out.println("----------------");
            Financiamento financiamento = new Financiamento(ValorImovel, prazoFinanciamento, taxaJurosAnual);
            financiamentos.add(financiamento);
            System.out.println();
        }

        double TotaldoImovel = 0;
        double TotaldoFinanciamentos = 0;

        // Pegando os valores fornecidos
        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            TotaldoImovel += financiamento.getValorimovel();
            TotaldoFinanciamentos += financiamento.TotaldoPagamento();
            financiamento.ShowDadosImovel();
            System.out.println();
        }

        System.out.printf("%nTotal de todos os imóveis: R$ %.2f%n", TotaldoImovel);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", TotaldoFinanciamentos);

    }

}
