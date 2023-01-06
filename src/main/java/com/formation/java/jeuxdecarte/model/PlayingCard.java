package com.formation.java.jeuxdecarte.model;

public class PlayingCard {
	private Rank rank;
	private Suit suit;
	private boolean faceUp;
	
	public PlayingCard(Rank rank,Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}
	public boolean Flip() {
		this.faceUp = !faceUp;
		return faceUp;
	}

}
