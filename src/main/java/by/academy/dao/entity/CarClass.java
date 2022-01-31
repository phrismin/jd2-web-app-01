package by.academy.dao.entity;

public enum CarClass {
//    BUDGET,
//    MIDDLE,
//    BUSINESS,
//    PREMIUM,
//    SUV,
//    BUS,
//    CONVERTIBLE,
//    EXCLUSIVE;

    BUDGET("Budget"),
    MIDDLE("Middle"),
    BUSINESS("Business"),
    PREMIUM("Premium"),
    SUV("SUV"),
    BUS("Bus"),
    CONVERTIBLE("Convertible"),
    EXCLUSIVE("Exclusive");

    private final String carClassName;

    CarClass(String carClassName) {
        this.carClassName = carClassName;
    }

    public String getCarClassName() {
        return carClassName;
    }

    public static CarClass fromValue(int value) {
        for (CarClass carClass : CarClass.values()) {
            if (carClass.ordinal() == value) {
                return carClass;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}
