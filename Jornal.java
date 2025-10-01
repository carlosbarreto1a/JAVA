package biblioteca;

public class Jornal extends MaterialBiblioteca  {
    private String dataEdicao;

    public Jornal(String dataEdicao, String autor, int anoPublicacao) {
        super(autor, anoPublicacao);
        this.dataEdicao = dataEdicao;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }
    
    @Override
    public String exibirDetalhes() {
    return super.exibirDetalhes() + "\nData da edição: " + dataEdicao;
        
    }
}
