/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package main;

import java.io.*;
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

        // Solicitando quanto imoveis o usuario vai querer financiar
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

        // Salvar os dados no arquivo
        String DadosTexto = "DadosFinanciamento.txt";
        CriaArquivo.salvarDados(financiamentos, DadosTexto);

        // // Ler os dados do arquivo
        // System.out.println("--------- Dados Lidos do Arquivo ---------");
        // CriaArquivo.lerDados(DadosTexto);
        // System.out.print("----------------");

        // usando o metodo que serializa os dados
        String DadosSerializados = "DadosSerializados.ser";
        CriaArquivo.serializarDados(financiamentos, DadosSerializados);

        // Lendo e desserializando os dados do arquivo serializado
        ArrayList<Financiamento> DadosDesserializados = CriaArquivo.desserializarDados(DadosSerializados);
        if (DadosDesserializados != null) {
            System.out.println("\n---------  Dados lidos do arquivo serializao: ---------");
            for (Financiamento financiamento : DadosDesserializados) {
                System.out.printf("Valor do Imóvel: R$ %.2f%n", financiamento.getValorImovel());
                System.out.printf("Valor do Financiamento: R$ %.2f%n", financiamento.getTotaldoPagamento());
                financiamento.ShowDadosImovel();
                System.out.println();
            }
        }
    }

    public static class CriaArquivo {

        public static void salvarDados(ArrayList<Financiamento> financiamentos, String nomeArquivo) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) {
                for (Financiamento financiamento : financiamentos) {
                    escritor.write(String.format("Valor do Imovel: %.2f\n", financiamento.getValorImovel()));
                    escritor.write(
                            String.format("Valor do Financiamento: %.2f\n", financiamento.getTotaldoPagamento()));
                    escritor.write(String.format("Taxa de Juros Anual: %.2f %%\n", financiamento.getTaxaJurosAnual()));
                    escritor.write(
                            String.format("Prazo de Financiamento: %d anos\n", financiamento.getPrazoFinanciamento()));
                    if (financiamento instanceof Apartamento) {
                        Apartamento apartamento = (Apartamento) financiamento;
                        escritor.write(
                                String.format("Numero de Vagas na Garagem: %d\n", apartamento.getNumVagasGaragem()));
                        escritor.write(
                                String.format("Numero do Andar do Apartamento: %d\n", apartamento.getNumAndar()));
                    } else if (financiamento instanceof Casa) {
                        Casa casa = (Casa) financiamento;
                        escritor.write(
                                String.format("Tamanho da Área Construida: %.2f m²\n", casa.getTamAreaConstruida()));
                        escritor.write(String.format("Tamanho do Terreno: %.2f m²\n", casa.getTamTerreno()));
                    } else if ((financiamento instanceof Terreno)) {
                        Terreno terreno = (Terreno) financiamento;
                        escritor.write(String.format("Tipo da Zona: %s\n", terreno.getTipoZona()));
                    }
                    escritor.write("----------------\n");
                }
                System.out.println("Dados Foram Salvos com Exito no Arquivo : " + nomeArquivo);
            } catch (IOException e) {
                System.err.println("Erro ao Salvar o Arquivo: " + e.getMessage());
            }
        }

        // Metodo para Ler os dados do arquivo
        public static void lerDados(String nomeArquivo) {
            try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
                String linhas;
                while ((linhas = leitor.readLine()) != null) {
                    System.out.println(linhas);
                }
            } catch (IOException e) {
                System.err.println("Erro ao Tentar ler o Arquivo: " + e.getMessage());
            }
        }

        // Metodo para serializar os dados no arquivo
        public static void serializarDados(ArrayList<Financiamento> financiamentos, String nomeArquivo) {
            try (ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
                saida.writeObject(financiamentos);
                System.out.println("Dados Serializados com sucesso em : " + nomeArquivo);
            } catch (IOException e) {
                System.err.println("Erro ao Serializar Dados : " + e.getMessage());
            }
        }

        @SuppressWarnings("unchecked")
        public static ArrayList<Financiamento> desserializarDados(String nomeArquivo) {
            ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>();
            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
                ArrayList<Financiamento> dados = (ArrayList<Financiamento>) entrada.readObject();
                financiamentos.addAll(dados);
                System.out.println("Dados Serializados com sucesso em : " + nomeArquivo);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Erro ao Serializar Dados : " + e.getMessage());
            }
            return financiamentos;
        }
    }
}
