package MiniProjet;
import java.util.*;
public class Cadres_Dirigeants extends Personnel{

	Personnel[] Subalternes;
	
	//Création d'un constructeur pour la classe
	public Cadres_Dirigeants(String nom, double Id, String matricule) {
		super(nom, Id, matricule);
		// TODO Auto-generated constructor stub
	}
	
	//Création d'une méthode pour enregistrer les subalternes
	public void enregistrer_sub(Personnel[] p) {
		Subalternes= p;
	}
	
	//Création d'une méthode pour afficher les subalternes
	public void Afficher_sub(int n) {
			System.out.println("Subalternes nom: "+ Subalternes[n].getNom());
			System.out.println("Subalternes indice: "+ Subalternes[n].getId());
			System.out.println("Subalternes matricule: "+ Subalternes[n].getMatricule());
		}
		
	

	

	
 }

