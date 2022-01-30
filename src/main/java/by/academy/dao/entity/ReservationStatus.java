package by.academy.dao.entity;

public enum ReservationStatus {
    NEW, APPROVE, RESERVE, REJECT;

    public static ReservationStatus fromValue(int value) {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status.ordinal() == value) {
                return status;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}