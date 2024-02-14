package com.edubridge.lambdaexp;

@FunctionalInterface
public interface Product {
   void displayProductPrice(int var1);

   default String displayProductName() {
      return "Perfume";
   }

   static String ProductBrand() {
      return "Michelle";
   }
}
