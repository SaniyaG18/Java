package com.edubridge.abstraction;

public abstract class GovernmentAgency {
	   private String agencyName;
	   private long budget;

	   public String getAgencyName() {
	      return this.agencyName;
	   }

	   public String setAgencyName(String agencyName) {
	      this.agencyName = agencyName;
	      return this.agencyName;
	   }

	   public long getBudget() {
	      return this.budget;
	   }

	   public long setBudget(long budget) {
	      this.budget = budget;
	      return this.budget;
	   }

	   public String print() {
	      return "Concrete Method ";
	   }

	   abstract void displayDetails();

	   abstract void displayDetails(String var1, long var2);

	   public String toString() {
	      return "GovernmentAgency [agencyName=" + this.agencyName + ", budget=" + this.budget + "]";
	   }
	}