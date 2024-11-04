package Encapsul;
class Person {
    private int age;
    private String name;
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }

    public String getNmae(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

  }
  
  class Main {
    public static void main(String[] args) {
  
      Person p1 = new Person();
  
      p1.setAge(24);
      p1.setName("Juan Perez");
  
      System.out.println("My age is " + p1.getAge());
      System.out.println("My name is " + p1.getNmae());
    }
}