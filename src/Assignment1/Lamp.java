package Assignment1;

public class Lamp {
    private int watt;
    private boolean isOn;

    Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public String toString() {
       return "[ Watt: " + watt + " on: " + isOn + " ]";
    }

    public int getWatt() {
        return watt;
    }
}
