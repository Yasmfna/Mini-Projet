package MiniProjet;

public class Commerciaux extends Personnel {
	
	private double interet;
	public double nextSalaire;
	private int nbres_ventes;

	
	public Commerciaux(String nom, int Id, String matricule,double salaire) {
		super(nom, Id, matricule );
		this.salaire=salaire;
		// TODO Auto-generated constructor stub
	}
	
	public Commerciaux(String nom, double id2, String matricule, double nextSalaire) {
		super(nom, Id, matricule );
		this.nom=nom;
		this.matricule=matricule;
		this.salaire= nextSalaire;
		this.Id=id2;
		// TODO Auto-generated constructor stub
	}
	

	public double getInteret(){
		return interet;
	}
	
	public double getNbres_ventes(){
		return nbres_ventes;
	}
	
	public double interet(int nbres_ventes,double salaire) {
		if(nbres_ventes<=10000) {
			return this.salaire+nbres_ventes*5/100; 
		}else if(nbres_ventes>10000 & nbres_ventes<=1000000) {
			return this.salaire+nbres_ventes*10/100;
		}else {
			return this.salaire+nbres_ventes*20/100;
		}
	}
	
	
	

}
