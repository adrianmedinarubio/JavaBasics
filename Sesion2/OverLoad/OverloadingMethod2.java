package OverLoad;
public class OverloadingMethod2 {
    boolean display(int a){
        System.out.println("Integer data.");
        return false;
    }

    String display(String a){
        System.out.println("String data.");
        return "";
    }

    public static void main(String[] args) {
        OverloadingMethod2 obj = new OverloadingMethod2();
        obj.display(1);
        obj.display("Hola");
        //display(1);
        //display("Hello");
    }
}
