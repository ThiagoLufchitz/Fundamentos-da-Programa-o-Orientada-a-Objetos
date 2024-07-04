/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package main;

import java.util.ArrayList;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Terreno;
import modelo.Financiamento;
import modelo.Excecoes.EntradaInvalidaException;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) throws EntradaInvalidaException {
        double TotaldoImovel = 0;
        double TotaldoFinanciamentos = 0;

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>();

        int nImoveis = 0;

        while (true) {
            try {
                nImoveis = interfaceUsuario.qtdImoveis();
                break;
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }

        // Solicitando quato imoveis para o usuario
        for (int i = 1; i <= nImoveis; i++) {
            System.out.printf("Digite os Dados do %d° Imovel ->  ", i);
            int tipoImovel = 0;
            double ValorImovel = 0;
            int prazoFinanciamento = 0;
            double taxaJurosAnual = 0;
            while (true) {
                try {
                    tipoImovel = interfaceUsuario.TipoImovel();
                    break;
                } catch (EntradaInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                try {
                    ValorImovel = interfaceUsuario.ValorImovel();
                    break;
                } catch (EntradaInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                try {
                    prazoFinanciamento = interfaceUsuario.PrazoFinanciamento();
                    break;
                } catch (EntradaInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                try {
                    taxaJurosAnual = interfaceUsuario.TaxaJurosAnual();
                    break;
                } catch (EntradaInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            }
            // System.out.print("----------------\n");

            Financiamento financiamento = null;
            // Selecionando o tipo do imovel
            switch (tipoImovel) {
                case 1:
                    String tipoZona = "";
                    while (true) {
                        try {
                            tipoZona = interfaceUsuario.TipoZona();
                            break;
                        } catch (EntradaInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    financiamento = new Terreno(ValorImovel, prazoFinanciamento,
                            taxaJurosAnual, tipoZona);
                    break;
                case 2:
                    int numVagasGaragem = 0;
                    int numAndar = 0;
                    while (true) {
                        try {
                            numVagasGaragem = interfaceUsuario.NumVagasGaragem();
                            break;
                        } catch (EntradaInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            numAndar = interfaceUsuario.NumAndar();
                            break;
                        } catch (EntradaInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    financiamento = new Apartamento(ValorImovel, prazoFinanciamento,
                            taxaJurosAnual, numVagasGaragem, numAndar);
                    break;
                case 3:
                    double tamAreaConstruida = 0;
                    double tamTerreno = 0;
                    while (true) {
                        try {
                            tamAreaConstruida = interfaceUsuario.TamAreaConstruida();
                            break;
                        } catch (EntradaInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            tamTerreno = interfaceUsuario.TamTerreno();
                            break;
                        } catch (EntradaInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    financiamento = new Casa(ValorImovel, prazoFinanciamento,
                            taxaJurosAnual, tamAreaConstruida, tamTerreno);
                    break;
                default:
                    System.out.println("Tipo de imóvel inválido.");
                    return;
            }

            financiamentos.add(financiamento);
            TotaldoImovel += financiamento.getValorImovel();
            TotaldoFinanciamentos += financiamento.TotaldoPagamento();

        }
        System.out.print("----------------\n");
        // Pegando os valores fornecidos
        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            System.out.printf("Financiamento do Imovel %d - valor do imóvel: R$ %.2f, valor do financiamento: R$ %.3f",
                    (i + 1), financiamento.getValorImovel(), financiamento.TotaldoPagamento());
            System.out.println();
            financiamento.ShowDadosImovel();

        }
        System.out.print("----------------");
        System.out.printf("\nTotal de todos os imóveis: R$ %.2f , Total de todos os financiamentos: R$ %.3f%n",
                TotaldoImovel, TotaldoFinanciamentos);

    }

}
