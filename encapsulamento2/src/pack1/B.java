package pack1;

import pack2.D;

public class B extends A{

    public int b1;
    private int b2;
    protected int b3;
    int b4;

    void testeB() {
        D d = new D();
        //d. //enxerga o b1 "public" | b3 "protected" | a1 "public" | a3 "protected" | d1 "public".
    }
}
