package com.create.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(new WhiteShipPartsFactory()), "Whiteship", "white@example.com");
        client.print(new WhiteShipFactory(new WhiteShipProPartsFactory()), "Whiteship", "white@example.com");
    }

    public static void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
