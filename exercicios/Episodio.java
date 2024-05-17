public class Episodio {
    // Atributos da Classe
    private String titulo;
    private int duracao;

    // Metodo construtor da classe Episodio
    public Episodio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // Metodo para imprimir as informações do episodio
    public void imprimirEpisodio() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Duração: " + this.duracao + " minutos");
    }

    // Metodo Principal
    public static void main(String[] args) {
        // Criação de instancia de Episodio
        Episodio episodio1 = new Episodio("Episodio 1", 45);
        Episodio episodio2 = new Episodio("Episodio 2", 50);
        Episodio episodio3 = new Episodio("Episodio 3", 55);
        Episodio episodio4 = new Episodio("Episodio 4", 60);
        Episodio episodio5 = new Episodio("Episodio 5", 65);

        // Mostrando as informação de um Episodio como exemplo
        episodio1.imprimirEpisodio();
        episodio2.imprimirEpisodio();
        episodio3.imprimirEpisodio();
        episodio4.imprimirEpisodio();
        episodio5.imprimirEpisodio();

    }
}
