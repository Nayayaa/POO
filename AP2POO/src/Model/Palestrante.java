package Model;

public class Palestrante {

    private String nome;
    private String email;
    private String instituicao;

    public Palestrante(String nome, String email, String instituicao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "O nome: " + nome + "/nEmail: " + email + "/nInstituição: " + instituicao;
    }
}
