package com.formation.java.jeuxdecarte.model;

public enum Rang {
	DEUX (2),
	TROIS(3),
	QUATRE(4),
	CINQ(5),
	SIX(6),
	SEPT(7),
	HUIT(8),
	NEUF(9),
	VALET(10),
	REINE(11),
	ROI(12),
	AS(13);
	
	int rang;
	
	private Rang(int value) {
		rang = value ;
	}
	
	public int value() {
		return rang;
	}
}