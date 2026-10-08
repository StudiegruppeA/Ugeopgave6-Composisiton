package Assignment2;

public class Contest {
    private Animal a1;
    private Animal a2;
    private int round;
    private static int counter = 0;

    Contest(Animal a1, Animal a2) {
        this.a1 = a1;
        this.a2 = a2;
        this.round = counter + 1;
        counter++;
    }

    public void playGround() {
        System.out.println("--- Round number " + round + " ---");
        System.out.println(a1.getName() + " Attacks " + a2.getName() + " Dealing " + a1.attack());
        a2.takedmg(a1);
        System.out.println(a2.getName() + " Attacks " + a1.getName() + " Dealing " + a2.attack());
        a1.takedmg(a2);

        System.out.println(a1);
        System.out.println(a2);

    }

    public Animal getWinner() {
        if(a1.isActive() && a2.isActive()) {
            return null;
        }
        else if(a1.isActive()) {
            return a1;
        }
        return a2;
    }
}
