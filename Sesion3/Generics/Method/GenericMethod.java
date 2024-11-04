package Generics.Method;

class DemoClass {
    public <T> void genericsMethod(T data) {
      System.out.println("Metodo generic:");
      System.out.println("Data pasado: " + data);
    }
}

class Main {
    public static void main(String[] args) {
  
      
      DemoClass demo = new DemoClass();
  
      // Con String
      demo.<String>genericsMethod("Java");
  
      // Con integer
      demo.<Integer>genericsMethod(10);
    }
  }