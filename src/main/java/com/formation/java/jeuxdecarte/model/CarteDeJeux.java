package com.formation.java.jeuxdecarte.model;

public class CarteDeJeux {
	private RangCarte rangCarte;
	private CouleurCarte couleurCarte;
	private boolean faceCarte;
	
	public CarteDeJeux(RangCarte rangCarte,CouleurCarte couleurCarte) {
		this.couleurCarte = couleurCarte;
		this.rangCarte = rangCarte;
	}

	public RangCarte getRangCarte() {
		return rangCarte;
	}
	public CouleurCarte getCouleurCarte() {
		return couleurCarte;
	}

	public boolean isFaceCarte() {
		return faceCarte;
	}
	public boolean setFaceCarte(boolean faceCarte) {
		this.faceCarte = faceCarte;
		return faceCarte;
	}

}
