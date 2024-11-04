package Abstract_Interface.SampleInterface;

public class ObjetMovable implements Movement, Adjustable {

    private int x,y;
    private int size;

    public ObjetMovable(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public String toString(){
        return "(X : " + x + " , Y: " + y + " Size: " + size + ")"; 
    }

    @Override
    public void MoveUp() {
        y++;
        System.out.println(this);
    }

    @Override
    public void MoveDown() {
        y--;
        System.out.println(this);
    }

    @Override
    public void MoveLeft() {
        x--;
        System.out.println(this);
    }

    @Override
    public void MoveRight() {
        x++;
        System.out.println(this);
    }

    @Override
    public void IncrementSize() {
        size++;
        System.out.println(this);
    }

    @Override
    public void DecrementSize() {
        size--;
        System.out.println(this);
    }
    
}
