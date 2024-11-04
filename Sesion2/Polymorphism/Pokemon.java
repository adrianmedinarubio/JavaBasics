package Polymorphism;

//superclass, definir comportamientos para clases heredadas
public class Pokemon {
    private String name;

    public Pokemon(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;        
    }

    //Common behavior
    public String attack(){
        throw new UnsupportedOperationException("Ops, No se ha definido ataque");
    }
}
