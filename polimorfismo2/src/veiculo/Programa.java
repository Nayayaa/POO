package veiculo;

public class Programa {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();

        veiculo1.acelerar();
        veiculo1.frear();
        veiculo2.acelerar();
        veiculo2.frear();

    }
}
