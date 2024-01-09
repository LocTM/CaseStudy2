package model;

public class Shop {
    private String id;
    private String name;
    private double cost;
    private int year;

    public Shop() {
    }

    public Shop(String id, String name, double cost, int year) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
