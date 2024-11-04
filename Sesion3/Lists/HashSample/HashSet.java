package Lists.HashSample;

import java.util.Set;
import java.util.HashSet;

class HashSetSample {

    public static void main(String[] args) {
        // Creacion
        Set<Integer> set1 = new HashSet<>();

        // Agregar
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Crear otro
        Set<Integer> set2 = new HashSet<>();

        // Agregae
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union es: " + set2);
        //[1,2,3]
    }
}