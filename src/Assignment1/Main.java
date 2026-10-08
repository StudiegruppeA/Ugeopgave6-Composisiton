package Assignment1;

public class Main {

    public void main() {
        Building novo = new Building("Novo");

        Room office = new Room("Office");

        Room Kitchen = new Room("Kitchen");

        Room reception = new Room("Reception");

        novo.addRoom(office);
        novo.addRoom(Kitchen);
        novo.addRoom(reception);

        Lamp bigLight = new Lamp(100);
        Lamp smallLight = new Lamp(50);

        Window bigWindow = new Window(100,100);
        Window smallWindow = new Window(50,50);

        office.addLamp(bigLight);
        office.addLamp(smallLight);
        Kitchen.addLamp(bigLight);
        Kitchen.addLamp(smallLight);
        reception.addLamp(bigLight);
        reception.addLamp(smallLight);

        office.addWindow(bigWindow);
        office.addWindow(smallWindow);
        Kitchen.addWindow(bigWindow);
        Kitchen.addWindow(smallWindow);
        reception.addWindow(bigWindow);
        reception.addWindow(smallWindow);


        novo.printBuilding();



    }
}
