package by.academy.entity;

public enum BodyType {
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
