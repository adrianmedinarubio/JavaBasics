package Heritage;
class Animal {
    String name;

    public void display() {
        System.out.println("My name is " + name);
      }

    public void eat() {
      System.out.println("I can eat");
    }
  }
  

  class Bird extends Animal{

    @Override public void eat(){
        System.out.println("I eat semillas");
    }

    public void Fly()
    {
        System.out.println("I can fly");
    }
  }
  
  class Dog extends Animal {
  
    @Override public void eat() {
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }
}
  
  class Main {
    public static void main(String[] args) {
  
    Bird piolin = new Bird();
    piolin.name = "Twetie";
    piolin.display();
    piolin.eat();
    piolin.Fly();

    Dog labrador = new Dog();
    labrador.name = "Rocko";
    labrador.display();
  
    labrador.eat();
  
    }
  }
