package Assignment2;

public class Wolf extends Animal{

    Wolf() {
        super("Wolf", 100);
    }
    @Override
    public int attack() {
        return (int) (Math.random() * 50);
    }
}
