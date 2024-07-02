public class ex8 {
    static class FileTooLargeException extends Exception {
        public FileTooLargeException(String errorMessage) {
            super(errorMessage);
        }
    }

    static class NetworkErrorException extends Exception {
        public NetworkErrorException(String errorMessage) {
            super(errorMessage);
        }
    }

    static class UploadDeVideo {
        void upload(String videoFilePath) throws FileTooLargeException, NetworkErrorException {
            // Simulando a verificação do tamanho do arquivo de vídeo
            double videoFileSize = Math.random() * 1024; // Simula o tamanho do arquivo de vídeo
            if (videoFileSize > 500) { // Vamos assumir que 500 é o tamanho máximo permitido para este exemplo
                throw new FileTooLargeException("O arquivo de vídeo é muito grande!");
            }

            // Simulando a verificação da conexão de rede
            boolean networkIsUp = Math.random() > 0.5; // Simula a disponibilidade da rede
            if (!networkIsUp) {
                throw new NetworkErrorException("Erro na conexão de rede!");
            }

            // Se nenhum erro ocorreu, o vídeo foi "enviado"
            System.out.println("Vídeo enviado com sucesso!");
        }
    }

    public static void main(String[] args) {
        UploadDeVideo uploader = new UploadDeVideo();

        System.out.println("Subindo um vídeo. Tente rodar este código várias vezes para testar.");

        try {
            uploader.upload("caminho/do/video.mp4");
        } catch (FileTooLargeException e) {
            e.printStackTrace();
        } catch (NetworkErrorException e) {
            e.printStackTrace();
        }
    }
}
