package model;

public class Garments extends Shop implements Discount {
    private String style;
    private String color;

    public Garments() {
    }

    public Garments(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public Garments(String id, String name, double cost, int year, String style, String color) {
        super(id, name, cost, year);
        this.style = style;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Garments{" +
                "style='" + style + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public void getRealMoney() {
        if (getYear() < 2024) {
            double discountRate = 0.10;
            double discountedCost = getCost() - (getCost() * discountRate);
            System.out.println("Giá giảm giá cho " + getName() + ": " + discountedCost);
        } else {
            System.out.println("Giá không giảm cho sản phẩm " + getName() + ": " + getCost());
        }
    }
}
