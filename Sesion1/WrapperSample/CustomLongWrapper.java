package WrapperSample;

public class CustomLongWrapper {
    private long value;

    // Constructor
    public CustomLongWrapper(long value) {
        this.value = value;
    }

    // Get method
    public long getValue() {
        return value;
    }

    // Set method
    public void setValue(long value) {
        this.value = value;
    }

    // increment value by one
    public void increment() {
        value++;
    }

    // decrement value by one
    public void decrement() {
        value--;
    }

    // Method to add
    public void add(long num) {
        value += num;
    }

    // Method to subtract
    public void subtract(long num) {
        value -= num;
    }

    public static void main(String[] args) {
        // Create an instance
        CustomLongWrapper wrapper = new CustomLongWrapper(10);
    
        //initial value
        System.out.println("Initial Value: " + wrapper.getValue());
    
        //operations
        wrapper.increment();
        System.out.println("increment: " + wrapper.getValue());
    
        wrapper.add(5);
        System.out.println("agregando 5: " + wrapper.getValue());
    
        wrapper.subtract(10);
        System.out.println("restando 10: " + wrapper.getValue());

        CustomLongWrapper otherWrapper =  null;
        System.out.println(otherWrapper);
    }    
}
