package Lists.HashSample;

import java.util.Map;
import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        // Creacion
        Map<String, Integer> numbers = new HashMap<>();

        // Agregar
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);
        //{One=1, Two=2}

        // Acceder por llaves
        System.out.println("Keys: " + numbers.keySet());
        //[One,Two]

        // Acceder por valores
        System.out.println("Values: " + numbers.values());
        //[1,2]

        // Acceder elements
        System.out.println("Entries: " + numbers.entrySet());
        //Entries: [One=1, Two=2]

        // Quitar elementos
        int value = numbers.remove("Two");
        System.out.println("Valor borrado: " + value);
    }
}