package OverLoad;

public class OverloadingMethod1 {
    private static void display(int a){
        System.out.println("Parameter: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Parameters: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
