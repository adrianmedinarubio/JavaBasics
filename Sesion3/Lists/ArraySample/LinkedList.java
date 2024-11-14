package Lists.ArraySample;

import java.util.List;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        // LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Agregar
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Acceder
        int number = numbers.get(2);
        System.out.println("Item: " + number);

        // Usar indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Posicion of 3 es " + index);

        // Quitar elemento
        int removedNumber = numbers.remove(1);
        System.out.println("Item borrado: " + removedNumber);
    }
}