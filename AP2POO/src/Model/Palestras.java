package Model;

public class Palestras extends Eventos {
    private Palestrante palestrante;

    public Palestra(String titulo, String duracao, int hora, double orcamento, Local local, Palestrante palestrante) {
        super(titulo, duracao, hora, orcamento, local);
        this.palestrante = palestrante;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    @Override
    public String getInformacao() {
        return "teste";
    }
}

