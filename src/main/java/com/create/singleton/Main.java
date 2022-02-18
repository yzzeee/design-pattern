package com.create.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = null;

        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings2 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings1 == settings2);
    }
}
