package by.academy.entity;

public enum Role {

    ADMIN("admin"),
    MANAGER("manager"),
    CUSTOMER("customer"),
    GUEST("guest");

    private final String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
