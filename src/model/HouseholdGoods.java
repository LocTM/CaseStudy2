package model;

public class HouseholdGoods extends Shop {
    private String manufacturer;

    public HouseholdGoods() {
    }

    public HouseholdGoods(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public HouseholdGoods(String id, String name, double cost, int year, String manufacturer) {
        super(id, name, cost, year);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "HouseholdGoods{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
