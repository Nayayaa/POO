package sobreescrita;

import teste.LuluDaPomerania;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();
        Animal meuAnimal3 = new LuluDaPomerania();

        meuAnimal1.emitirSom(); // "Au au"
        meuAnimal2.emitirSom(); // "Miau"
        meuAnimal3.emitirSom(); // 
    }
}