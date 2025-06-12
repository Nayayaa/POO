package Model;

public abstract class Local {

    private String nome;
    private int maxPessoas;
    private int bloco;

    public Local(String nome, int maxPessoas, int bloco) {
        this.nome = nome;
        this.maxPessoas = maxPessoas;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxPessoas() {
        return maxPessoas;
    }

    public void setMaxPessoas(int maxPessoas) {
        this.maxPessoas = maxPessoas;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public abstract String getInformacao();

    public final String getInformacaoTotal(){
        return "Nome: " + nome + ", com capacidade máxima de: " + maxPessoas + ", no bloco: " + bloco;
    }

    @Override
    public String toString() {
        return getInformacaoTotal() + " | " + getInformacao();
    }
}

