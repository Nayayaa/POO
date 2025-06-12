package Model;

public class Auditorios extends Local{

    private double sistemaSom;
    private double traducaoSimul;

    public Auditorios(String nome, int maxPessoas, int bloco, double sistemaSom, double traducaoSimul) {
        super(nome, maxPessoas, bloco);
        this.sistemaSom = sistemaSom;
        this. traducaoSimul = traducaoSimul;
    }

    public double getSistemaSom() {
        return sistemaSom;
    }

    public void setSistemaSom(double sistemaSom) {
        this.sistemaSom = sistemaSom;
    }

    public double getTraducaoSimul() {
        return traducaoSimul;
    }

    public void setTraducaoSimul(double traducaoSimul) {
        this.traducaoSimul = traducaoSimul;
    }

    @Override
    public String getInformacao() {
        return "O auditório tem: " +  sistemaSom + "e" + traducaoSimul;
    }
}
