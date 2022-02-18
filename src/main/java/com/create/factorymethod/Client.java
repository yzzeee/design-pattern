package com.create.factorymethod;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "Whiteship", "white@example.com");
        client.print(new BlackShipFactory(), "Blackship", "black@example.com");
    }

    public static void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
