package Lists.TreeSample;

import java.util.Map;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {
        // Creacion
        Map<String, Integer> values = new TreeMap<>();

        // Insercion
        values.put("Segundo", 2);
        values.put("Primero", 1);
        System.out.println("TreeMap: " + values);

        // Reemplazo
        values.replace("Primero", 11);
        values.replace("Segundo", 22);
        System.out.println("Nuevo Map: " + values);

        // Quitar 
        int removedValue = values.remove("Primero");
        System.out.println("Valor borrado: " + removedValue);
    }
}