package by.academy.entity;

public enum Role {
    ADMIN, MANAGER, CUSTOMER, GUEST;

    public static Role fromValue(int value) {
        for (Role role : Role.values()) {
            if (role.ordinal() == value) {
                return role;
            }
        }
        throw new RuntimeException("Unknown value: " + value);
    }
}
