package com.codedifferently;

import java.util.Map;

public abstract class Clothes {
    private static Integer itemNumberIndex = 1;
    private Integer itemNumber;
    private OccasionEnum occasion;
    private BrandEnum brand;
    private Double price;
    private Integer size;
    private String color;
    private FabricEnum fabric;
    private String pattern;

    public Clothes(Map<String, Object> data){
        this.occasion = (data.containsKey("occasion"))?(OccasionEnum) data.get("occasion"):null;
        this.brand = (data.containsKey("brand"))?(BrandEnum) data.get("brand"):null;
        this.price = (data.containsKey("price"))?(Double) data.get("price"):null;


    }
    public Clothes(OccasionEnum occasion, BrandEnum brand, Double price, Integer size, String color, FabricEnum fabric, String pattern) {
        this.itemNumber = itemNumberIndex;
        this.occasion = occasion;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
        this.pattern = pattern;
    }


    public Integer getItemNumber() {
        return itemNumber;
    }

    public static void setItemNumberIndex(Integer update){
        itemNumberIndex = update;
    }

    public OccasionEnum getOccasion() {
        return occasion;
    }

    public void setOccasion(OccasionEnum occasion) {
        this.occasion = occasion;
    }

    public BrandEnum getBrand() {
        return brand;
    }

    public void setBrand(BrandEnum brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FabricEnum getFabric() {
        return fabric;
    }

    public void setFabric(FabricEnum fabric) {
        this.fabric = fabric;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Clothes {" +
                "itemNumber=" + itemNumber +
                ", occasion=" + occasion +
                ", brand=" + brand +
                ", price=" + price +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", fabric=" + fabric +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}
