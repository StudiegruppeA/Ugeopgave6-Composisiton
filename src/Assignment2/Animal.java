package Assignment2;

public abstract class Animal {
    private String name;
    private int energy;

    Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean isActive() {
        if(energy > 0 ) {
            return true;
        }
        return false;
    }

    public abstract int  attack();

    public String toString() {
        return "[ Name: " + name + " Energy: " + energy + " ]";
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void takedmg(Animal animal) {
        this.energy -= animal.attack();
    }
}
