package Model;

public class Salas extends Local {

    private String salaNum;
    private boolean equip;

    public Salas(String nome, int maxPessoas, int bloco, String salaNum, boolean equip) {
        super(nome, maxPessoas, bloco);
        this.salaNum = salaNum;
        this.equip = equip;
    }

    public String getSalaNum() {
        return salaNum;
    }

    public void setSalaNum(String salaNum) {
        this.salaNum = salaNum;
    }

    public boolean getEquip() {
        return equip;
    }

    public void setEquip(boolean equip) {
        this.equip = equip;
    }
    @Override
    public String getInformacao() {
        return "teste";
    }
}
