import java.util.*;

public class Serie {
    // Atributos da Classe Seris
    String nome;
    ArrayList<Episodio> episodios;

    // Metodos construtor da classe Serie
    Serie(String nome) {
        this.nome = nome;
        this.episodios = new ArrayList<>();
    }

    // Método para adicionar episódio à serie
    void adicionarEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

    // Metodo para imprimir as informações da serie
    void imprimirSerie() {
        System.out.println("Serie: " + this.nome);
        System.out.println("Episódio: ");
        for (Episodio episodio : this.episodios) {
            episodio.imprimirEpisodio();
        }
    }

    public static void main(String[] args) {
        Episodio episodio1 = new Episodio("Episodio 1", 47);
        Episodio episodio2 = new Episodio("Episodio 2", 51);
        Episodio episodio3 = new Episodio("Episodio 2", 52);

        // Criação de uma instaqncia de Serie
        Serie serie = new Serie("Serie 1");

        // colocando os episodios nas series
        serie.adicionarEpisodio(episodio1);
        serie.adicionarEpisodio(episodio2);
        serie.adicionarEpisodio(episodio3);

        // criando mais epidios e adicionando ao msm tempo
        serie.adicionarEpisodio(new Episodio("Episodio 4", 59));
        serie.adicionarEpisodio(new Episodio("Episodio 5", 66));
        // Mostrar o que tem na serie
        serie.imprimirSerie();
    }
}
