package by.academy.entity;

public class RentPrice {
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
}
