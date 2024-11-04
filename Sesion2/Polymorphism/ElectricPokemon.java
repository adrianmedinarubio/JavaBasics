package Polymorphism;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name) {
        super(name);
    }
    @Override
    public String attack(){
        return "Aplicar super carga";
    }
}
