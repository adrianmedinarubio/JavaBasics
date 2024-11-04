package HandleException;

class ExceptionSample {

    public static void divideByZero() {
        // Lanza excepcion
        throw new ArithmeticException("Dividio por cero");
    }
    public static void main(String[] args) {
  
      try {
  
        // Genera exception
        int divideByZero = 5 / 0;
        System.out.println("Esto no se imprime"  + divideByZero);
      }
      
      catch (ArithmeticException e) {
        //System.out.println("ArithmeticException => " + e.getMessage());
        divideByZero();
      }
      finally {
        System.out.println("Esto siempre se ejecuta");
      } 
    }
}