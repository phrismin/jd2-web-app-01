package by.academy.entity;

import java.io.Serializable;

public enum BodyType implements Serializable {
    SEDAN, HATCHBACK, CROSSOVER, WAGON, VAN, COUPE, SUV, MINIBUS, CONVERTIBLE;

    public static BodyType fromValue(int value) {
        for (BodyType bodyType : BodyType.values()) {
            if (bodyType.ordinal() == value) {
                return bodyType;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}
