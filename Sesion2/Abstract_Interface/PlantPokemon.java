package Abstract_Interface;

public class PlantPokemon extends Pokemon {

    public PlantPokemon(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Lanzar aroma floral";
    }

}
