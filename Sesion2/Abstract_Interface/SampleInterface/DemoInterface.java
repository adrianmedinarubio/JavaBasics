package Abstract_Interface.SampleInterface;

public class DemoInterface {
    public static void main(String[] args){
        ObjetMovable objetMovable = new ObjetMovable(1, 1,10);
        System.out.println(objetMovable);
        objetMovable.MoveUp();
        objetMovable.MoveRight();
        objetMovable.DecrementSize();
    }
}
