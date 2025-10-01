package biblioteca;

public class Revista {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroEdicao;

    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroEdicao = numeroEdicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + " | Autor: " + autor +
               " | Ano: " + anoPublicacao + " | Edição: " + numeroEdicao;
    }
}
