package com.create.factorymethod.example;

import com.create.factorymethod.BlackShip;
import com.create.factorymethod.WhiteShip;

public class SimpleFactory {

    public Object createProduct (String name) {
        if (name.equalsIgnoreCase("whiteship")) {
            return new WhiteShip();
        } else if (name.equalsIgnoreCase("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
