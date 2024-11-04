package Generics.Class;

class GenericsClass<T> {
  
    private T data;
  
    public GenericsClass(T data) {
      this.data = data;
    }
  
    public T getData() {
      return this.data;
    }
  }

class Main {
    public static void main(String[] args) {
  
      //con un entero 
      GenericsClass<Integer> intObj = new GenericsClass<Integer>(10);
      System.out.println("returns: " + intObj.getData());
  
      //con String
      GenericsClass<String> stringObj = new GenericsClass<String>("Java Programming");
      System.out.println("returns: " + stringObj.getData());

      GenericsClass<Double> floatObjs = new GenericsClass<Double>(11.1);
      System.out.println(floatObjs);
    }
}
  
  