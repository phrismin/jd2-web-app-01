package by.academy.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long SerialVersionUID = 2;

    private Long id;
    private String name;
    private String password;
    private UserRole userRole;

    public User() {
    }

    public User(Long id, String name, String password, UserRole userRole) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
