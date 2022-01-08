package by.academy.entity;

public enum CarClass {

    BUDGET, MIDDLE, BUSINESS, PREMIUM, SUV, CONVERTIBLE;

    public static CarClass fromValue(int value) {
        for (CarClass carClass : CarClass.values()) {
            if (carClass.ordinal() == value) {
                return carClass;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}
