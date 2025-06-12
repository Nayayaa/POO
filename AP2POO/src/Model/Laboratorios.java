package Model;

public class Laboratorios extends Local{

    private int numCompu;
    private String tipoLab;

    public Laboratorios(String nome, int maxPessoas, int bloco, int numCompu, String tipoLab) {
        super(nome, maxPessoas, bloco);
        this.numCompu = numCompu;
        this.tipoLab = tipoLab;
    }
    @Override
    public String getString() {
        return "O Laboratório: " + tipoLab + "possui " + numCompu + " de computadores";
    }
}
