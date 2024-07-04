package modelo;

public class Excecoes {

    public static class DescontoMaiorDoQueJurosException extends Exception {
        public DescontoMaiorDoQueJurosException(String message) {
            super(message);
        }
    }

    public static class EntradaInvalidaException extends Exception {
        public EntradaInvalidaException(String message) {
            super(message);
        }
    }
}
