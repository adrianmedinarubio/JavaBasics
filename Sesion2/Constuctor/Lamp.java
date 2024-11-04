package Constuctor;

class Lamp
{
    String _owner;
    boolean isOn;
    int _intense;

    Lamp(){
        isOn = false;
    }

    Lamp(int intense){
        isOn = true;
        _intense = intense;
    }

    Lamp(String owner)
    {
        _owner = owner;
    }

    void TurnOn()
    {
        isOn = true;
        System.out.println("Encendido");
    }

    void TurnOff()
    {
        isOn = false;
        System.out.println("Apagado");
    }

    public static void main(String[] args)
    {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.TurnOn();
        led.TurnOff();
        halogen.TurnOn();
        halogen.TurnOff();
    }
}
