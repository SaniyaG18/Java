package com.edubridge.lambdaexp;

public class ProductExecutor {
	   public static void main(String[] aergs) {
	      Product p = (price) -> {
	         System.out.println("Price is:" + price);
	      };
	      System.out.println(p.displayProductName());
	      System.out.println(Product.ProductBrand());
	      p.displayProductPrice(1500);
	   }
	}
	 