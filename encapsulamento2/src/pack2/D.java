package pack2;

import pack1.B;

public class D extends B {

    public int d1;
    private int d2;
    protected int d3;
    int d4;

    void testeD() {
        D d = new D();
        //d. //enxerga todos os seus modificadores de acesso (d1, d2, d3, d4) | a1 "public" | a3 "protected" | b1 "public".
    }
}
