package Model;

public class Instrutores {

    private int cargaHoraria;
    private String materiais;

    public Instrutores(int cargaHoraria, String materiais) {
        this.cargaHoraria = cargaHoraria;
        this.materiais = materiais;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getMateriais() {
        return materiais;
    }

    public void setMateriais(String materiais) {
        this.materiais = materiais;
    }
}
