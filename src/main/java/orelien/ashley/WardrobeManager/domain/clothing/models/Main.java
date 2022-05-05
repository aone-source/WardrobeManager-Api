package com.codedifferently;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt(OccasionEnum.FORMAL, BrandEnum.LANDSEND, 0.00, 14, "Black", FabricEnum.COTTON, "none");
        Trouser trouser = new Trouser(OccasionEnum.FORMAL, BrandEnum.LANDSEND, 0.00, 14, "Black", FabricEnum.COTTON, "none");
        Dress dress = new Dress(OccasionEnum.FORMAL, BrandEnum.LANDSEND, 0.00, 14, "Black", FabricEnum.COTTON, "none");

        ArrayList<Shirt> myShirts = new ArrayList<>();
        ArrayList<Trouser> myTrousers = new ArrayList<>();
        ArrayList<Dress> myDresses = new ArrayList<>();

        myShirts.add(shirt);
        myTrousers.add(trouser);
        myDresses.add(dress);

        List<ArrayList> wardrobe = new ArrayList<>();
        wardrobe.add(myShirts);
        wardrobe.add(myTrousers);
        wardrobe.add(myDresses);

        System.out.println(wardrobe);
    }
}
