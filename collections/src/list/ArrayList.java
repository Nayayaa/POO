package list;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

    List<String> Lista = new java.util.ArrayList<String>();

    public static void main(String[] args) {
        // Declaração de um set de String
        List<String> list = new java.util.ArrayList<String>();
        list.add("pão de formna");
        list.add("ovos");
        list.add("frutas");
        list.add("frutas"); // Não é uma duplicata porque há dois objetos String com conteúdo igual
        String itemDalista = "café";
        list.add(itemDalista);
        list.add(itemDalista); // Isto é uma duplicata

        // Interação usando for tradicional


        // ineteração usando for each
        for(String item : list) {
            System.out.println(item);
        }

        // interação usando for each com expressão Lambda
        list.forEach(item -> System.out.println(item));

        // interação usando Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
