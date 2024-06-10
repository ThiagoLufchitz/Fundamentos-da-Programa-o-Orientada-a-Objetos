/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package main;

import java.util.ArrayList;

import modelo.*;
import util.IntefaceUsuario;

public class Main {
    public static void main(String[] args) {
        double TotaldoImovel = 0;
        double TotaldoFinanciamentos = 0;

        IntefaceUsuario intefaceUsuario = new IntefaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>();

        int nImoveis = intefaceUsuario.qtdImoveis();

        // Solicitando quato imoveis para o usuario
        for (int i = 1; i <= nImoveis; i++) {
            System.out.println("Digite os Dados do " + i + "° Imovel :");
            int tipoImovel = intefaceUsuario.TipoImovel();
            double ValorImovel = intefaceUsuario.ValorImovel();
            int prazoFinanciamento = intefaceUsuario.PrazoFinanciamento();
            double taxaJurosAnual = intefaceUsuario.TaxaJurosAnual();
            System.out.print("----------------");
            System.out.println();
            Financiamento financiamento = null;
            switch (tipoImovel) {
                case 1:
                    financiamento = new Terreno(ValorImovel, prazoFinanciamento,
                            taxaJurosAnual);
                    break;
                case 2:
                    financiamento = new Apartamento(ValorImovel, prazoFinanciamento,
                            taxaJurosAnual);
                    break;
                case 3:
                    financiamento = new Casa(ValorImovel, prazoFinanciamento,
                            taxaJurosAnual);
                    break;
                default:
                    System.out.println("Tipo de imóvel inválido.");
                    return;
            }

            financiamentos.add(financiamento);
            TotaldoImovel += financiamento.getValorImovel();
            TotaldoFinanciamentos += financiamento.TotaldoPagamento();

        }

        // Pegando os valores fornecidos
        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            System.out.printf("Financiamento do Imovel %d - valor do imóvel: R$ %.2f, valor do financiamento: R$ %.3f",
                    (i + 1), financiamento.getValorImovel(), financiamento.TotaldoPagamento());
            System.out.println();
        }

        System.out.printf("\nTotal de todos os imóveis: R$ %.2f , Total de todos os financiamentos: R$ %.3f%n",
                TotaldoImovel, TotaldoFinanciamentos);
    }

}
