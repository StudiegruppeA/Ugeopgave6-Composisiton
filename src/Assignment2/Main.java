package Assignment2;

import java.util.ArrayList;

public class Main {

    public void main(){
        ArrayList<Animal> animals = new ArrayList<>();
        Rabbit r1 = new Rabbit();
        Lion l1 = new Lion();
        Wolf w1 = new Wolf();
        Wolf w2 = new Wolf();

        Contest c1 = new Contest(l1,w1);
        Contest c2 = new Contest(w1,w2);

        c2.playGround();
        c2.playGround();
        c2.playGround();
        System.out.println(c2.getWinner());

    }
}
