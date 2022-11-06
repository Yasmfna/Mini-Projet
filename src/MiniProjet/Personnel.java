package MiniProjet;

public class Personnel {
	
	//Création des différents champ utile dans ma class mère
	protected static String nom;
	protected String matricule;
	protected static double Id;
	private static int valfixe=20000;
	

	public int getValfixe() {
		return valfixe;
	}

	public void setValfixe(int valfixe) {
		this.valfixe = valfixe;
	}

	public double salaire;
	public Personnel(String nom,double Id,String matricule) {
		this.nom= nom;
		this.Id= Id;
		this.matricule= matricule;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public double getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

    ////Création d'une méthode pour afficher les identifiants de notre employer
	public void affiche() {
		System.out.println(nom);
		System.out.println(matricule);
		System.out.println(Id);
	}
	//Création d'une méthode pour calculer le salaire des employers
	public static double calculs(double Id) {
		double salaire=(Id * valfixe) ;
		System.out.println("Vous avez exactement un salaire de "+salaire+" FCFA");
		return salaire;
	}
	
	
	
	
	
	
	
	
}


