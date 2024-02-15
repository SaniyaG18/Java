package com.edubridge.interfacedemo;
import com.edubridge.interfacedemo.Books.StoryBooks;
public class NestedInterfaceDemo implements Books,StoryBooks{
	   public void ShowBooks() {
	      System.out.println("Missing");
	   }

	   public void ShowStoryBooks() {
	      System.out.println("The Story of lost temple");
	   }
	}
	    
