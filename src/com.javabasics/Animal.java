package com.javabasics;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.Objects;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);

            int quantity = ois.readInt();
            Animal[] result = new Animal[quantity];

            for(int i = 0; i < quantity; i++) {
                result[i] = (Animal)ois.readObject();
            }

            return  result;

        } catch (Exception e) {
            throw new IllegalArgumentException();
        }


    }
}
