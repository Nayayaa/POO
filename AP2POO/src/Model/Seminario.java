package Model;

public class Seminario extends Eventos{

    private String nomeAluno;
    private String tema;
    private String organizador;

    public Seminario(String titulo, String data, int hora, double orcamento, Local local, String tema, String nomeAluno, String organizador) {
        super(titulo, data, hora,orcamento, local);
        this.nomeAluno = nomeAluno;
        this.tema = tema;
        this.organizador = organizador;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    @Override
    public String getInformacao() {
        return "teste";
    }
}
