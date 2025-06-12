package Model;

import java.util.HashSet;
import java.util.Set;

public class Eventos {

    private String titulo;
    private String data;
    private int hora;
    private double orcamento;

    private Local local;
    private Set<Palestrante> palestrantes;

    public Eventos(String titulo, String data, int hora, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.orcamento = orcamento;
        this.local = local;
        this.palestrantes = new HashSet<Palestrante>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Set<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(Set<Palestrante> palestrantes) {
        this.palestrantes = palestrantes;
    }
}
