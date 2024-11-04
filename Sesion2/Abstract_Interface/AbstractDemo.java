package Abstract_Interface;

public class AbstractDemo {
    public static void main(String[] args) {
        WaterPokemon p1 = new WaterPokemon("squirtle");
        System.out.println(p1.getName());
        System.out.println(p1.attack());

        PlantPokemon p2 = new PlantPokemon("Bulbasaur");
        System.out.println(p2.getName());
        System.out.println(p2.attack());
    }
}
