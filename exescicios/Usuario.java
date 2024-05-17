import java.util.ArrayList;

public class Usuario {
    // Atributos da Classe
    String nome;
    String email;
    String senha;
    ArrayList<Serie> seriesAssistidas;

    // Metodos construtor
    Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.seriesAssistidas = new ArrayList<>();
    }

    // Metodos para imprimir as informções do usuario
    void imprimir() {
        System.out.println("Nome:  " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Séries assitidas: ");
        for (Serie serie : this.seriesAssistidas) {
            serie.imprimirSerie();
        }
        System.out.println("\n\n");
    }

    boolean adicionarSerieAoHistorico(Serie serie) {
        // Verificamos antes se a série já existe no historico
        if (this.seriesAssistidas.contains(serie)) {
            return false;
        } else {
            this.seriesAssistidas.add(serie);
            return true;
        }
    }

    // Metodo para verificar se uma senha fornecida é a senha correta do usuario
    boolean verificarSenha(String senhaFornecida) {
        return this.senha.equals(senhaFornecida);
    }

    public static void main(String[] args) { // Metodo principal
        // Criação de instancias de Episodio
        Episodio episodio1 = new Episodio("Episodio 1", 11);
        Episodio episodio2 = new Episodio("Episodio 2", 22);
        Episodio episodio3 = new Episodio("Episodio 3", 33);

        // Criacao de uma instancia de Seria
        Serie serie = new Serie("Serie 1");

        // Adicionar episodios a serie
        serie.adicionarEpisodio(episodio1);
        serie.adicionarEpisodio(episodio2);
        serie.adicionarEpisodio(episodio3);

        // Criar uma instancia de usuario
        Usuario usuario = new Usuario("joao", "Joao@email.com", "23");

        // Impressao das informações do usuario
        usuario.imprimir();

        // Verificação da Senha
        boolean SenhaCerta = usuario.verificarSenha("23");
        System.out.println("Senha fornecida está correta? " + SenhaCerta);

        boolean SenhaErrada = usuario.verificarSenha("32");
        System.out.println("Senha fornecida está Incorreta? " + SenhaErrada);

        usuario.adicionarSerieAoHistorico(serie);

        usuario.imprimir();

    }
}
