package Abstract_Interface;

abstract public class Pokemon {
    private String name;

    public Pokemon(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    abstract public String attack();
}
