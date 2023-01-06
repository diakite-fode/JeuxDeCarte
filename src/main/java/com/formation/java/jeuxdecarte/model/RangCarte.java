package com.formation.java.jeuxdecarte.model;

public enum RangCarte {
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
	
	int rangCarte;
	
	private RangCarte(int valueur) {
		rangCarte = valueur ;
	}
	
	public int valeur() {
		return rangCarte;
	}
}