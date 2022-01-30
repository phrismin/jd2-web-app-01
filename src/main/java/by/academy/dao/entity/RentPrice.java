package by.academy.dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class RentPrice implements Serializable {
    private static final long serialVersionUID = 8L;

    private Long id;
    private String startRent;
    private String endRent;
    private Double value;

    public RentPrice() {
    }

    public RentPrice(Long id, String startRent, String endRent, Double value) {
        this.id = id;
        this.startRent = startRent;
        this.endRent = endRent;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartRent() {
        return startRent;
    }

    public void setStartRent(String startRent) {
        this.startRent = startRent;
    }

    public String getEndRent() {
        return endRent;
    }

    public void setEndRent(String endRent) {
        this.endRent = endRent;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentPrice rentPrice = (RentPrice) o;
        return Objects.equals(id, rentPrice.id) && Objects.equals(startRent, rentPrice.startRent)
                && Objects.equals(endRent, rentPrice.endRent) && Objects.equals(value, rentPrice.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startRent, endRent, value);
    }
}
