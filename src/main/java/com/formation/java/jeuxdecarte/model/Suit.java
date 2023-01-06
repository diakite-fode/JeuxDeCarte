package com.formation.java.jeuxdecarte.model;

public enum Suit {
	DIAMONDS(1), HEART(2), SPIDES(3), CLUBS(4);

	int suit;

	private Suit(int value) {
		suit = value;
	}

	public int valeur() {
		return suit;
	}

}
