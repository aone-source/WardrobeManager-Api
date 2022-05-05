package com.codedifferently;

public class Shirt extends Clothes implements Shirts{
    public Shirt(OccasionEnum occasion, BrandEnum brand, Double price, Integer size, String color, FabricEnum fabric, String pattern) {
        super(occasion, brand, price, size, color, fabric, pattern);
    }

    @Override
    public Boolean getHasHood() {
        return Shirts.super.getHasHood();
    }

    @Override
    public String getCollar() {
        return Shirts.super.getCollar();
    }

    @Override
    public String toString() {
        return "Shirt {" +
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
