import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Agregar elementos
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Imprime lista: " + numbers);

        // Acceder a un elemento
        int number = numbers.get(2);
        System.out.println("Item: " + number);

        // Quitar un elemento
        int removedNumber = numbers.remove(1);
        System.out.println("Item borrado: " + removedNumber);
    }
}