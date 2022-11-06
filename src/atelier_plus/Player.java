package atelier_plus;

import atelier_plus.De;

public class Player {
	private String nom;
	private De de;
	// Création du constructeur
	public Player(String nom) {
		this.nom = nom;
		//this.de = de;
	}
	
	// Retourner le nom du joueur
	public String nom() {
		return nom;
	}
	
	// Faire jouer
	public void Jouer() {
		de.lancer();
	}
	
	//Retourner la face visible
	public int resultat() {
		return de.faceVisible();
	}
	
	//Retourner une représentation du nom
	public String toString(){
		return nom;
		
	}


}
