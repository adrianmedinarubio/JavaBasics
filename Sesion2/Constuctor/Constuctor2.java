package Constuctor;
public class Constuctor2 {
    String languages;

  // constructor accepting single value
  Constuctor2(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Lang");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Constuctor2 obj1 = new Constuctor2("Java");
    Constuctor2 obj2 = new Constuctor2("Python");
    Constuctor2 obj3 = new Constuctor2("C#");

  }
}
