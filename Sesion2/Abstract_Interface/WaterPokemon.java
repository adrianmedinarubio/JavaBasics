package Abstract_Interface;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Usa bomba de agua";
    }

}
