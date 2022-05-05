package com.codedifferently;

public interface Trousers {

     default Boolean getHasPockets() {
          return true;
     }

     default String getClosure() {
          return "Zipper";
     }

     default String getCut() {
          return "Straight";
     }
}
