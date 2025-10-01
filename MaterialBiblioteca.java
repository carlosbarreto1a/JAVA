package biblioteca;


public abstract class  MaterialBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public MaterialBiblioteca(String autor, int anoPublicacao) {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }


 public String exibirDetalhes(){
 return "Titulo: " + titulo + "/n" + "Autor: " + autor + "/n" + "Ano de Publicacao: " + anoPublicacao;   
   
}
 public void emprestar() {
     System.out.println("Material emprestado: "  + titulo);   
     
 }
}
