package by.academy.dao.entity;

public enum CarClass {
    BUDGET, MIDDLE, BUSINESS, PREMIUM, SUV, BUS, CONVERTIBLE, EXCLUSIVE;

    public static CarClass fromValue(int value) {
        for (CarClass carClass : CarClass.values()) {
            if (carClass.ordinal() == value) {
                return carClass;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}
