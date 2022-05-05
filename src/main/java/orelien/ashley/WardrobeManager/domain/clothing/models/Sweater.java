package com.codedifferently;

public class Sweater extends Clothes implements Sweaters {
    public Sweater(OccasionEnum occasion, BrandEnum brand, Double price, Integer size, String color, FabricEnum fabric, String pattern) {
        super(occasion, brand, price, size, color, fabric, pattern);
    }

    @Override
    public Boolean getHasPlacket() {
        return Sweaters.super.getHasPlacket();
    }

    @Override
    public Boolean getHasHood() {
        return Sweaters.super.getHasHood();
    }

    @Override
    public String getCollar() {
        return Sweaters.super.getCollar();
    }

    @Override
    public String getSleeve() {
        return Sweaters.super.getSleeve();
    }

    @Override
    public String toString() {
        return "Sweater {" +
                "itemNumber=" + getItemNumber() +
                ", occasion=" + getOccasion() +
                ", brand=" + getBrand() +
                ", price=" + getPrice() +
                ", size=" + getSize() +
                ", color='" + getColor() + '\'' +
                ", fabric=" + getFabric() +
                ", pattern='" + getPattern() + '\'' +
                '}';
    }
}
