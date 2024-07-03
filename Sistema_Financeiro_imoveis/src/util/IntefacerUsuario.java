/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package util;

import java.util.*;
import modelo.Excecoes.*;

public class IntefacerUsuario {
    private Scanner sc;

    // metodo que le valores inseridos pelo usuario
    public IntefacerUsuario() {
        sc = new Scanner(System.in);
    }

    // Método para solicitar a quantidade de imóveis ao usuário
    public int qtdImoveis() throws EntradaInvalidaException {
        System.out.print("Digite a quantidade de imóveis que deseja financiar:");
        try {
            return sc.nextInt();
        } catch (Exception e) {
            throw new EntradaInvalidaException("Entrada inválida. Digite um número inteiro válido.");
        }
    }

    // Metodo para obter o tipo do imovel a ser financiado
    public int TipoImovel() throws EntradaInvalidaException {
        while (true) {
            try {
                System.out.print("O Imóvel a ser Financiado é: Terreno(1), Apartamento(2) ou Casa(3)? ");
                int tipo = sc.nextInt();
                if (tipo >= 1 && tipo <= 3) {
                    return tipo;
                }
                throw new EntradaInvalidaException("Valor incorreto. Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada inválida : %.2f . Digite um valor numérico válido. \n", e);
            }
        }
    }

    // Metodo para obter o valor do imovel e verificar se é uma valor valido
    public double ValorImovel() throws EntradaInvalidaException {
        double valorImovel;
        while (true) {
            try {
                System.out.print("Digite o valor do Imóvel: ");
                valorImovel = sc.nextDouble();
                if (valorImovel > 50000) {
                    return valorImovel;
                }
                throw new EntradaInvalidaException("Valor incorreto. Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada inválida : %.2f . Digite um valor numérico válido. \n", e);
            }
        }
    }

    // Metodo publico e obtem os valor de prazo a ser financiado e verifica se sao
    // valores validos
    public int PrazoFinanciamento() throws EntradaInvalidaException {
        int prazo;
        while (true) {
            try {
                System.out.print("Digite o valor do Prazo Financiado? ");
                prazo = sc.nextInt();
                if (prazo > 1 && prazo <= 35) {
                    return prazo;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!(Entre 1 a 35 anos)");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada inválida : %.2f . Digite um valor numérico válido. \n", e);
            }
        }
    }

    // metodo que obtem os valores da taxa de juros anula e verifica se é
    // maior que 12%
    // Taxa de juros anual de terreno max 12%,para casa e apartamento 11,5%.
    // valor aceitos pelo programa
    public double TaxaJurosAnual() throws EntradaInvalidaException {
        double taxa;
        while (true) {
            try {
                System.out.print("Digite o valor da Taxa de Juros Anual? ");
                taxa = sc.nextDouble();
                if (taxa >= 1 && taxa <= 12) {
                    return taxa;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!(Entre 0.1% a 12%)");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada inválida : %.2f . Digite um valor numérico válido. \n", e);

            }

        }
    }

    // Metodo para Obter o tamanho da area construida e verificar se o numero nao e
    // negativo
    public double TamAreaConstruida() throws EntradaInvalidaException {
        double area;
        while (true) {
            try {
                System.out.println("Digite o Tamanho da Área Contruida? ");
                area = sc.nextDouble();
                if (area > 0) {
                    return area;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada Incorreta: %.2f !! Digite novamente.\n");
                sc.next();
            }
        }
    }

    public double TamTerreno() throws EntradaInvalidaException {
        double terreno;
        while (true) {
            try {
                System.out.println("Digite o Tamanho do Terreno? ");
                terreno = sc.nextDouble();
                if (terreno > 0) {
                    return terreno;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada Incorreta: %.2f !! Digite novamente.\n");
                sc.next();
            }
        }
    }

    public int NumVagasGaragem() throws EntradaInvalidaException {
        int vaga;
        while (true) {
            try {
                System.out.println("Digite o Número de Vagas na Garagem? ");
                vaga = sc.nextInt();
                if (vaga > 0) {
                    return vaga;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada Incorreta: %.2f !! Digite novamente.\n");
                sc.next();
            }
        }
    }

    public int NumAndar() throws EntradaInvalidaException {
        int andar;
        while (true) {
            try {
                System.out.println("Digite o Número do Andar? ");
                andar = sc.nextInt();
                if (andar > 0) {
                    return andar;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada Incorreta: %.2f !! Digite novamente.\n");
                sc.next();
            }
        }
    }

    public String TipoZona() throws EntradaInvalidaException {

        String tipo;
        while (true) {
            try {
                System.out.print("Digite o Tipo da Zona da Casa (Residencial/Comercial): ");
                tipo = sc.next();
                if (tipo == "R" && tipo == "C") {
                    return tipo;
                }
                throw new EntradaInvalidaException("Valor Incorreto !! Digite novamente!");
            } catch (EntradaInvalidaException e) {
                System.out.printf("Entrada Incorreta: %.2f !! Digite novamente.\n");
                sc.next();
            }
        }
    }
}
