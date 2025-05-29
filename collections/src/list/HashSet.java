package list;

import java.util.*;

public class HashSet {

    public static void main(String[] args) {
        // declaração de um set de strings
        Set<String> lista = new java.util.HashSet<String>();
        lista.add("pão de forma");
        lista.add("ovos");
        lista.add("frutas");
        lista.add("frutas"); // não é uma duplicata porque há dois objetos String com conteúdo igual
        String itemDaLista = "café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); // isto é uma duplicata

        // iteração usando for each
        for(String item : lista) {
            System.out.println(item);
        }

        // iteração usando for each com expressão Lambda
        lista.forEach(item -> System.out.println(item));

        // iteração usando um Iterator
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

