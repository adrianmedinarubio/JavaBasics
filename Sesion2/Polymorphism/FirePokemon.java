package Polymorphism;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name) {
        super(name);
    }
    
    @Override
    public String attack(){
        return "Lanza llamarada";
    }
}
