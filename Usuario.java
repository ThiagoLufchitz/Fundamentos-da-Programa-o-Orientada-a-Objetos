public class Usuario {
    // Atributos da Classe
    String nome;
    String email;
    String senha;

    // Metodos construtor
    Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Metodos para imprimir as informções do usuario
    void imprimir() {
        System.out.println("Nome:  " + this.nome);
        System.out.println("Email: " + this.email);
    }

    // Metodo para verificar se uma senha fornecida é a senha correta do usuario
    boolean verificarSenha(String senhaFornecida) {
        return this.senha.equals(senhaFornecida);
    }

    public static void main(String[] args) { // Metodo principal
        // Criar uma instancia de usuario
        Usuario usuario = new Usuario("joao", "Joao@email.com", "23");

        // Impressao das informações do usuario
        usuario.imprimir();

        // Verificação da Senha
        boolean SenhaCerta = usuario.verificarSenha("23");
        System.out.println("Senha fornecida está correta? " + SenhaCerta);

        boolean SenhaErrada = usuario.verificarSenha("32");
        System.out.println("Senha fornecida está Incorreta? " + SenhaErrada);

    }
}
