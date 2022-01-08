package by.academy.entity;

import java.util.Objects;

public class Greeting {
    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Greeting greeting = (Greeting) o;
        return message.equals(greeting.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
