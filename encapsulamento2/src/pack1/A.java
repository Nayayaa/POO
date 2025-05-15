package pack1;

import pack2.D;

public class A {

    public int a1;
    private int a2;
    protected int a3;
    int a4;

    void testeA(){
        D d = new D();
        //d.  // enxerga a1 "public" | a3 "protected" | b1 "public" | b3 "protected" | d1 "public"
    }
}
