package Assignment1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("You have added room: " + room.getName() + " That was room nr: " + rooms.size());
    }

    public int getTotalLampCount() {
        int sum = 0;
        for (Room r : rooms) {
            sum += r.getLampCount();
        }
        return sum;
    }

    public int getTotalWatt() {
        int sum = 0;
        for(Room r : rooms) {
            sum += r.getTotalWatt();
        }
        return sum;
    }

    public void printBuilding() {
        System.out.println("Building name: " + name);
        System.out.println("Total Watt: " +getTotalWatt());
        System.out.println("Total window area²" + getTotalWatt());
        for(Room r: rooms) {
            r.printRoom();
        }
    }
}
