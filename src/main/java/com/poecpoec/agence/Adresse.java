package com.poecpoec.agence;

public class Adresse {

	// Attributs
	private String adresse;
	private String codePostal;
	private String ville;
	private String pays;
	private int id;

	// Constructeur
	public Adresse() {

	}

	// Getters(assesseurs) et Setters(mutateurs)
	public String getAdresse() {
		return adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public String getPays() {
		return pays;
	}

	public int getId() {
		return id;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Adresse ID " + id + " : " + adresse + " " + codePostal + " - " + ville + " [" + pays + "]";
	}

}
