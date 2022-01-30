package by.academy.dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class Fine implements Serializable {
    private static final long serialVersionUID = 6L;

    private Long id;
    private Double price;
    private String description;

    public Fine() {
    }

    public Fine(Long id, Double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return Objects.equals(id, fine.id) && Objects.equals(price, fine.price)
                && Objects.equals(description, fine.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, description);
    }
}
