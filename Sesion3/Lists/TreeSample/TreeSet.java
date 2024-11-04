package Lists.TreeSample;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class TreeSetSample {

    public static void main(String[] args) {
        // Crear TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Agregar
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Imprime set: " + numbers);
        //[1,2,3]

        // Access Elements using iterator()
        System.out.print("Accediendo por iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}