import java.util.Random;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex1(scanner);
        ex2(scanner);
        ex3(null);
        ex4(scanner);
        ex5(scanner);
        ex61(scanner);
        ex7(scanner);
        ex8(scanner);
        ex9(scanner);
        ex10(scanner);
        scanner.close();
    }

    public static void ex1(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é: " + media);
        // scanner.close();
    }

    public static void ex2(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        // scanner.close();
    }

    public static void ex3(String[] args) {
        int numero = 0;
        do {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 30);
    }

    public static void ex4(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        // scanner.close();
    }

    public static void ex5(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        boolean bissexto = false;
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = true;
            }
        }
        if (bissexto) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
        // scanner.close();
    }

    public static void ex61(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble(); // Converte para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit); // Verifica e imprime se está frio,
                                                                                  // moderado ou quente
        if (fahrenheit < 32) {
            System.out.println("Está frio!");
        } else if (fahrenheit <= 80) {
            System.out.println("Está moderado!");
        } else {
            System.out.println("Está quente!");
        }
        // scanner.close();
    }

    public static void ex7(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // scanner.close();
    }

    public static void ex8(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        String[] unidadesRomanas = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] dezenasRomanas = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] centenasRomanas = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] milharesRomanas = { "", "M", "MM", "MMM" };
        System.out.print("Digite um número inteiro entre 1 e 4000: ");
        int numero = scanner.nextInt();
        if (numero < 1 || numero > 4000) {
            System.out.println("Número inválido. Por favor, tente novamente.");
        } else {
            String unidades = unidadesRomanas[numero % 10];
            String dezenas = dezenasRomanas[(numero / 10) % 10];
            String centenas = centenasRomanas[(numero / 100) % 10];
            String milhares = milharesRomanas[(numero / 1000) % 10];
            String numeroRomano = milhares + centenas + dezenas + unidades;
            System.out.println("Número romano equivalente: " + numeroRomano);
        }
        // scanner.close();
    }

    public static void ex9(Scanner scanner) {
        String[] palavras = { "abacaxi", "banana", "laranja", "morango", "uva" };
        Random random = new Random();
        // Scanner scanner = new Scanner(System.in);
        String palavraSelecionada = palavras[random.nextInt(palavras.length)];
        int tentativas = 6;
        StringBuilder palavraAdivinhada = new StringBuilder();
        for (int i = 0; i < palavraSelecionada.length(); i++) {
            palavraAdivinhada.append("_");
        }
        System.out.println("Bem-vindo ao jogo da Forca!");
        System.out.println("Tente adivinhar a palavra!");
        while (tentativas > 0) {
            System.out.println("Palavra: " + palavraAdivinhada);
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);
            boolean letraAdivinhada = false;
            for (int i = 0; i < palavraSelecionada.length(); i++) {
                if (palavraSelecionada.charAt(i) == letra) {
                    palavraAdivinhada.setCharAt(i, letra);
                    letraAdivinhada = true;
                }
            }
            if (!letraAdivinhada) {
                tentativas--;
            }
            if (palavraAdivinhada.toString().equals(palavraSelecionada)) {
                System.out.println("Parabéns! Você adivinhou a palavra correta: " + palavraSelecionada);
                break;
            }
        }
        if (tentativas == 0) {
            System.out.println("Game over! A palavra era: " + palavraSelecionada);
        }
        // scanner.close();
    }

    public static void ex10(Scanner scanner) {
        String palavra1 = "banana";
        String palavra2 = "bandnanana";
        int distancia = calcularDistanciaLevenshtein(palavra1, palavra2);
        System.out.println("Distância de Levenshtein entre \"" + palavra1 + "\" e \"" + palavra2 + "\": " + distancia);
    }

    public static int calcularDistanciaLevenshtein(String palavra1, String palavra2) {
        int m = palavra1.length();
        int n = palavra2.length();
        int[][] matrizDistancia = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            matrizDistancia[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            matrizDistancia[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (palavra1.charAt(i - 1) == palavra2.charAt(j - 1)) {
                    matrizDistancia[i][j] = matrizDistancia[i - 1][j - 1];
                } else {
                    int deletar = matrizDistancia[i - 1][j] + 1;
                    int inserir = matrizDistancia[i][j - 1] + 1;
                    int substituir = matrizDistancia[i - 1][j - 1] + 1;
                    matrizDistancia[i][j] = Math.min(Math.min(deletar, inserir), substituir);
                }
            }
        }
        return matrizDistancia[m][n];
    }

}
