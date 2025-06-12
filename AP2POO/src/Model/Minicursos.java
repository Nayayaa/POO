package Model;

import java.util.Set;

public class Minicursos extends Eventos {
    private Set<Instrutores> instrutores;
    private int cargaHoraria;
    private Set<String> materialApoio;

    public Minicursos(String titulo, String data, int hora, double orcamento, Local local) {
        super(titulo, data, hora, orcamento, local);
        this.instrutores = instrutores;
        this.cargaHoraria = cargaHoraria;
        this.materialApoio = materialApoio;
    }

    public Set<Instrutores> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Set<Instrutores> instrutores) {
        this.instrutores = instrutores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<String> getMaterialApoio() {
        return materialApoio;
    }

    public void setMaterialApoio(Set<String> materialApoio) {
        this.materialApoio = materialApoio;
    }

    @Override
    public String getInformacao() {
        return "teste";
    }
}