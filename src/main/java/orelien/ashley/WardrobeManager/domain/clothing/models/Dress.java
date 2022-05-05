package com.codedifferently;

import java.util.Map;

public class Dress extends Clothes implements Dresses {

    public Dress(Map<String, Object> data) {
        super(data);
    }

    public Dress(OccasionEnum occasion, BrandEnum brand, Double price, Integer size, String color, FabricEnum fabric, String pattern) {
        super(occasion, brand, price, size, color, fabric, pattern);
    }

    @Override
    public Boolean getHasSleeves() {
        return Dresses.super.getHasSleeves();
    }

    @Override
    public String toString() {
        return "Dress {" +
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
