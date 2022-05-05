package com.codedifferently;

public class Trouser extends Clothes implements Trousers{

    public Trouser(OccasionEnum occasion, BrandEnum brand, Double price, Integer size, String color, FabricEnum fabric, String pattern) {
        super(occasion, brand, price, size, color, fabric, pattern);
    }

    @Override
    public Boolean getHasPockets() {
        return Trousers.super.getHasPockets();
    }

    @Override
    public String getClosure() {
        return Trousers.super.getClosure();
    }

    @Override
    public String getCut() {
        return Trousers.super.getCut();
    }

    @Override
    public String toString() {
        return "Trouser {" +
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
