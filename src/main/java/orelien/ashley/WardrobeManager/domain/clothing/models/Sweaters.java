package com.codedifferently;

public interface Sweaters {

    default Boolean getHasPlacket() {
        return false;
    }

    default Boolean getHasHood(){
        return false;
    }

    default String getCollar() {
        return "Boat neck";
    }

    default String getSleeve() {
        return "Long";
    }
}
