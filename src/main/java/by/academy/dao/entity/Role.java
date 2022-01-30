package by.academy.dao.entity;

public enum Role {
    ADMIN, MANAGER, CUSTOMER, GUEST;

//    @Override
//    public static Role valueOf(String name) {
//        for (Role role : Role.values()) {
//            if (role.toString().equals(name)) {
//                return role;
//            }
//        }
//        throw new RuntimeException("Unknown value: " + name);
//    }
}
