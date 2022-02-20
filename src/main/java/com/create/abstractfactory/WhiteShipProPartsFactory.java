package com.create.abstractfactory;

public class WhiteShipProPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteShipProAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteShipProWheel();
    }
}
