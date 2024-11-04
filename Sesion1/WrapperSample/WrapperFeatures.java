package WrapperSample;

public class WrapperFeatures {
    public static void main(String[] args) {

        // objetos iniciales
        Integer intObj = new Integer(100); 
        Double doubleObj = Double.valueOf(3.1416); 
        Boolean boolObj = Boolean.TRUE; 

        // Autoboxing
        Integer otherIntObj = 200; // int to Integer

        // Unboxing
        int intValue = intObj.intValue(); 
        double doubleValue = doubleObj.doubleValue(); 
        boolean boolValue = boolObj.booleanValue(); 

        // Printing values
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Boolean Object: " + boolObj);

        System.out.println("Another Integer Object: " + otherIntObj);

        System.out.println("Unboxed Integer Value: " + intValue);
        System.out.println("Unboxed Double Value: " + doubleValue);
        System.out.println("Unboxed Boolean Value: " + boolValue);

        // Using in collections
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        // Autoboxing
        arrayList.add(10); 
        arrayList.add(20);

        System.out.println("ArrayList: " + arrayList);

        calculateSquare(intObj);
    }

    public static void calculateSquare(Integer num) {
        // Unboxing
        int square = num * num;
        System.out.println("El cuadrado de " + num + " is: " + square);
    }
}
