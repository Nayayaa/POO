package Model;

public class Participante {

        private String nome;
        private String cpf;
        private String email;
        private String curso;

        public Participante(String nome, String cpf, String email, String curso) {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.curso = curso;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String getInformacao() {
        return "teste";
    }
}
