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

    // Método para solicitar a quantidade de imóveis ao usuário
    public int qtdImoveis() {
        System.out.printf("Digite a quantidade de imóveis que deseja financiar:");
        return sc.nextInt();
    }

    // Metodo para obter o tipo do imovel a ser financiado
    public int TipoImovel() {
        while (true) {
            try {
                System.out.print("O Imovel a ser Financiado é: Terreno(1) , Apartamento(2) e Casa(3) ?");
                int tipo = sc.nextInt();
                if (tipo >= 1 && tipo <= 3) {
                    return tipo;
                }
                System.out.println("Valor Incorreto Digite novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }

        }
    }

    // Metodo para obter o valor do imovel e verificar se é uma valor valido
    public double ValorImovel() {
        double valorImovel;
        while (true) {
            try {
                System.out.print("Digite o valor do Imovel? ");
                valorImovel = sc.nextDouble();
                if (valorImovel > 50000) {
                    return valorImovel;
                }
                System.out.println("Valor Incorreto Digite, novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }

        }
    }

    // Metodo publico e obtem os valor de prazo a ser financiado e verifica se sao
    // valores validos
    public int PrazoFinanciamento() {
        int prazo;
        while (true) {
            try {
                System.out.print("Digite o valor do Prazo Financiado? ");
                prazo = sc.nextInt();
                if (prazo > 1 && prazo <= 35) {
                    return prazo;
                }
                System.out.println("Valor Incorreto !! Digite novamente!(Entre 1 a 35 anos)");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }

        }
    }

    // metodo que obtem os valores da taxa de juros anula e verifica se é
    // maior que 12%
    // Taxa de juros anual de terreno max 12%,para casa e apartamento 11,5%.
    // valor aceitos pelo programa
    public double TaxaJurosAnual() {
        double taxa;
        while (true) {
            try {
                System.out.print("Digite o valor da Taxa de Juros Anual? ");
                taxa = sc.nextDouble();
                if (taxa >= 1 && taxa <= 12) {
                    return taxa;
                }
                System.out.println("Valor Incorreto !! Digite novamente!(Entre 0.1% a 12%)");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }

        }
    }

    // Metodo para Obter o tamanho da area construida e verificar se o numero nao e
    // negativo
    public double TamAreaConstruida() {
        double area;
        while (true) {
            try {
                System.out.println("Digite o Tamanho da Área Contruida? ");
                area = sc.nextDouble();
                if (area > 0) {
                    return area;
                }
                System.out.println("Valor Incorreto !! Digite novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }
        }
    }

    public double TamTerreno() {
        double terreno;
        while (true) {
            try {
                System.out.println("Digite o Tamanho do Terreno? ");
                terreno = sc.nextDouble();
                if (terreno > 0) {
                    return terreno;
                }
                System.out.println("Valor Incorreto !! Digite novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }
        }
    }

    public int NumVagasGaragem() {
        int vaga;
        while (true) {
            try {
                System.out.println("Digite o Número de Vagas na Garagem? ");
                vaga = sc.nextInt();
                if (vaga > 0) {
                    return vaga;
                }
                System.out.println("Valor Incorreto !! Digite novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }
        }
    }

    public int NumAndar() {
        int andar;
        while (true) {
            try {
                System.out.println("Digite o Número do Andar? ");
                andar = sc.nextInt();
                if (andar > 0) {
                    return andar;
                }
                System.out.println("Valor Incorreto !! Digite novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }
        }
    }

    public String TipoZona() {

        String tipo;
        while (true) {
            try {
                System.out.print("Digite o Tipo da Zona da Casa (Residencial/Comercial): ");
                tipo = sc.next();
                if (tipo == "R" && tipo == "C") {
                    return tipo;
                }
                System.out.println("Valor Incorreto !! Digite novamente!");
            } catch (Exception e) {
                System.out.println("Entrada Incorreta !! Digite novamente.");
                sc.next();
            }
        }
    }
}
