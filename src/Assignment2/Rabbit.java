package Assignment2;

public class Rabbit extends Animal{
    Rabbit() {
        super("Rabbit", 150);
    }


    @Override
    public int attack() {
        return 10;
    }
}
