package by.academy.entity;

public enum ReservationStatus {

    NEW, APPROVE, REJECT;

    public static ReservationStatus fromValue(int value) {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status.ordinal() == value) {
                return status;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}