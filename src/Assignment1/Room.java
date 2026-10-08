package Assignment1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    Room(String name) {
        this.name = name;
        this.lamps = new ArrayList<Lamp>();
        this.windows = new ArrayList<Window>();
    }


    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
        System.out.println("You have added lamp nr: " + lamps.size() );
    }

    public void addWindow(Window window) {
        windows.add(window);
        System.out.println("you have added window nr: " + windows.size());
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {
        int sum = 0;
        for(Lamp l : this.lamps) {
            sum += l.getWatt();
        }
        return sum;
    }


    public int getTotalwindowarea() {
        int sum = 0;
        for(Window w : windows) {
            sum += w.getAreaCM2();
        }
        return sum;
    }


    public void printRoom() {
        System.out.println("[ Room name: " + name + " Lamps: " + getLampCount() + " Total watt: " + getTotalWatt() + " Windows: " + windows.size() + " Total cm²: " + getTotalwindowarea());
    }

    public String getName() {
        return name;
    }
}
