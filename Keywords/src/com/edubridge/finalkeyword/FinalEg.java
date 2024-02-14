package com.edubridge.finalkeyword;

public class FinalEg {
	   private String CardName;
	   @SuppressWarnings("unused")
	private final String ISSUER = "Govermant Of India";

	   public String getCardName() {
	      return this.CardName;
	   }

	   public void setCardName(String cardName) {
	      this.CardName = cardName;
	   }

	   public String getISSUER() {
	      return "Govermant Of India";
	   }

	   public String toString() {
	      return "FinalEg [CardName=" + this.CardName + ", ISSUER=" + "Govermant Of India" + "]";
	   }
	}
