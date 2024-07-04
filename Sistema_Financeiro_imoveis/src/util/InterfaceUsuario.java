/*Aluno : Thiago Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package util;

import java.util.*;
import modelo.Excecoes.*;

public class InterfaceUsuario {
    private Scanner sc;

    // metodo que le valores inseridos pelo usuario
    public InterfaceUsuario() {
        sc = new Scanner(System.in);
    }

    // Método para solicitar a quantidade de imóveis ao usuário
    public int qtdImoveis() throws EntradaInvalidaException {
        int qtd;
        while (true) {
            try {
                System.out.print("Digite a quantidade de imóveis que deseja financiar:");
                qtd = sc.nextInt();
                return qtd;
            } catch (InputMismatchException e) {
                String valorIncorreto = sc.next(); // Captura o valor incorreto digitado
                throw new EntradaInvalidaException(
                        "Valor incorreto: " + valorIncorreto + ". Digite um número inteiro válido.");
            }
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
                throw new EntradaInvalidaException(
                        "Valor Incorreto " + tipo + " !! Digite novamente!(Entre 1 a 3)");
            } catch (InputMismatchException e) {
                String t = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + t + ". Digite um valor numérico válido. ");
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
                if (valorImovel >= 50000) {
                    return valorImovel;
                }
                throw new EntradaInvalidaException(
                        "Valor Incorreto " + valorImovel + " !! Digite novamente!(Valores acima de 50.000,00)");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto + ". Digite um valor numérico válido. ");
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
                if (prazo >= 1 && prazo <= 35) {
                    return prazo;
                }
                throw new EntradaInvalidaException(
                        "Valor Incorreto " + prazo + " !! Digite novamente!(Entre 1 a 35 anos)");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto + ". Digite um valor numérico válido. ");
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
                if (taxa > 0 && taxa <= 12) {
                    return taxa;
                }
                throw new EntradaInvalidaException(
                        "Valor Incorreto " + taxa + " !! Digite novamente!(Entre 0.1% a 12%)");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto + ". Digite um valor numérico válido. ");
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
                if (area >= 50) {
                    return area;
                }
                throw new EntradaInvalidaException("Valor Incorreto " + area + "!! Digite novamente!");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto
                                + ". Digite um valor numérico válido.(Minimo permitido 50m²) ");
            }
        }
    }

    public double TamTerreno() throws EntradaInvalidaException {
        double terreno;
        while (true) {
            try {
                System.out.println("Digite o Tamanho do Terreno? ");
                terreno = sc.nextDouble();
                if (terreno >= 125) {
                    return terreno;
                }
                throw new EntradaInvalidaException("Valor Incorreto " + terreno + "!! Digite novamente!");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto
                                + ". Digite um valor numérico válido.(Minimo permitido 125m²) ");
            }
        }
    }

    public int NumVagasGaragem() throws EntradaInvalidaException {
        int vaga;
        while (true) {
            try {
                System.out.print("Digite o Número de Vagas na Garagem: ");
                vaga = sc.nextInt();
                if (vaga >= 0 && vaga <= 5) {
                    return vaga;
                }
                throw new EntradaInvalidaException("Valor Incorreto " + vaga + "!! Digite novamente (Entre 0 e 5)");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto + ". Digite um valor numérico válido. ");
            }
        }
    }

    public int NumAndar() throws EntradaInvalidaException {
        int andar;
        while (true) {
            try {
                System.out.print("Digite o Número do Andar? ");
                andar = sc.nextInt();
                if (andar >= 0) {
                    return andar;
                }
                throw new EntradaInvalidaException("Valor Incorreto " + andar + "!! Digite novamente!");
            } catch (InputMismatchException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto + ". Digite um valor numérico válido. ");
            }
        }
    }

    public String TipoZona() throws EntradaInvalidaException {
        String tipo;
        while (true) {
            try {
                System.out.print("Digite o Tipo da Zona da Casa (Residencial(R)/Comercial(C)): ");
                tipo = sc.next().toUpperCase();
                if (tipo.equals("R") || tipo.equals("C")) {
                    return tipo;
                }
                throw new EntradaInvalidaException(
                        "Valor Incorreto " + tipo + "!! Digite novamente!(R = Residencial / C = Comercial)");
            } catch (EntradaInvalidaException e) {
                String valorIcorreto = sc.next();
                throw new EntradaInvalidaException(
                        "Entrada inválida : " + valorIcorreto + ". Digite um valor numérico válido. ");
            }
        }
    }
}
