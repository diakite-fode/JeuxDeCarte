package com.formation.java.jeuxdecarte.model;

public enum CouleurCarte {
	CARREAU(1), COEUR(2), PIQUE(3), TREFLE(4);

	int couleurCarte;

	private CouleurCarte(int valeur) {
		couleurCarte = valeur;
	}

	public int valeur() {
		return couleurCarte;
	}

}
