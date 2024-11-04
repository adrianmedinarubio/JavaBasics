package Constuctor;
public class Constructor {
    private String name;
    
    // constructor
    Constructor() {
        System.out.println("Constructor");
        name = "Java";
    }
    
    public static void main(String[] args) {
    
        Constructor obj = new Constructor();
        System.out.println("The name is " + obj.name);
    }
}
