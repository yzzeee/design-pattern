package com.create.factorymethod;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "white@example.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "black@example.com");
        System.out.println(blackship);
    }
}
