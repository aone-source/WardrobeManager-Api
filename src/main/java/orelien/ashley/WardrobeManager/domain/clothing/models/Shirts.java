package com.codedifferently;

public interface Shirts {

    default Boolean getHasHood(){
        return false;
    }

    default String getCollar() {
        return "Crew";
    }
}
