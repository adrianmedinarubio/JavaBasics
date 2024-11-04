package Polymorphism;

public class DemoPolymorphism {
    public static void main(String[] args){

        Pokemon p1 = new FirePokemon("Charmander");
        System.out.println(p1.getName());
        System.out.println(p1.attack());

        Pokemon p2 = new ElectricPokemon("Pikachu");
        System.out.println(p2.getName());
        System.out.println(p2.attack());

        Pokemon p3 = new Pokemon("magikarp");
        System.out.println(p3.getName());
        System.out.println(p3.attack());
    }
}
