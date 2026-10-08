package Assignment2;

public class Lion extends Animal{

    Lion() {
        super("Lion", 80);
    }


    @Override
    public int attack() {
        return 30;
    }
}
