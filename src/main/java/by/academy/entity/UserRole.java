package by.academy.entity;

public enum UserRole {
    CUSTOMER, ADMIN, MANAGER;

    public static UserRole fromValue(int value) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.ordinal() == value) {
                return userRole;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}
