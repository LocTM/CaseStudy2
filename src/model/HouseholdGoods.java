package model;

public class HouseholdGoods {
    private String manufacturer;

    public HouseholdGoods() {
    }

    public HouseholdGoods(String manufacturer) {
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
