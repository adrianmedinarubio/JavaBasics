package Generics.Type;

//Integer, Double
class GenericsClass <T extends Number> {

    public void display() {
      System.out.println("This is a bounded type generics class.");
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      //String manda error
      //GenericsClass<String> obj = new GenericsClass<String>();

      GenericsClass<Integer> obClass = new GenericsClass<>();
      obClass.display();

      GenericsClass<Double> obClass2 = new GenericsClass<>();
      obClass2.display();

      GenericsClass<Float> obClass3 = new GenericsClass<>();
      obClass3.display();
    }
  }