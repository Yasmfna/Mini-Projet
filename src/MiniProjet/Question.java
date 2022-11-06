package MiniProjet;
import java.util.*;

public class Question {
	
	protected static String nom;
	protected static String matricule;
	protected static double Id;
	private static double Id2;
	private static double nextSalaire;
	
	private static final String Cadre ="cadre";
	private static final String Commerciaux ="commerciaux";

	public static void main(String[] main) {
		
		String choix;
		Scanner entree =new Scanner(System.in);
		Personnel employer= new Personnel(nom,Id,matricule);
		Cadres_Dirigeants cad = new Cadres_Dirigeants(nom,Id,matricule);
		Commerciaux cm = new Commerciaux(nom,Id2,matricule,nextSalaire);
		
		
		
		System.out.println("Bienvenue dans l'entreprise YASM SARL ! Veuillez vous enregistrez s'il vous plait !!");
		System.out.print("---> Votre nom:");
		String nom = entree.nextLine();
		System.out.println("  ");
		
		System.out.println("Veuillez entrez votre indice avec ',' pour les nombres decimaux. Merci!");
		System.out.print("---> Votre indice:");
		double Id = entree.nextDouble(); entree.nextLine();
		System.out.println("  ");
		
		System.out.print("---> Votre matricule:");
		String matricule = entree.nextLine();
		System.out.println("  ");
		
		System.out.println("L'employer "+nom+" d'indice "+Id+" et de matricule "+matricule);
		employer.calculs(Id);
		System.out.println("Vous pouvez passer au retrait de votre salaire maintenant ,MERCI");
		System.out.println("  ");
		
		System.out.println("------***------***------***------***-----");
		
		
		
		
		
		System.out.println("  ");
		System.out.print("Quel poste avez vous au sein de l'entreprise s'il vous plait?");
		System.out.println(" CADRE ou COMMERCIAUX  ");
		
		
		choix=entree.nextLine().trim().toLowerCase();
		
		if(choix.equals(Cadre))  { 
			System.out.print("Veuillez entrer le nombre de vos subalternes :");
			int nbres = entree.nextInt(); entree.nextLine();
			Personnel[] Tab = new Personnel[nbres];
			
			for(int i=0;i<Tab.length;i++) {
				System.out.println("Bienvenu "+nom);
				System.out.print("Veuillez entrez le NOM du "+(i+1)+" subalteres :");
				String Nom = entree.nextLine();
				System.out.print("Veuillez entrez l'INDICE du "+(i+1)+" subalteres :");
				Double ID = entree.nextDouble(); entree.nextLine();
				System.out.print("Veuillez entrez le MATRICULE du "+(i+1)+" subalteres :");
				String Matricule = entree.nextLine();
				System.out.println("------***------***------***------***-----");
				
				Tab[i]=new Personnel(Nom,ID,Matricule);
				cad.enregistrer_sub(Tab);
				
				}
			System.out.println("Vos SUBALTERES sont donc :");
			for(int j=0;j<Tab.length;j++) {
				System.out.println("Subalternes n."+ (j+1));
				cad.Afficher_sub(j);
				System.out.println("------***------***------***------***-----");
			}
			
			
		}else {
			System.out.println("Bienvenu "+nom);
			
			System.out.print("pourrais-je avoir votre INDICE :");
			double Id2 = entree.nextDouble(); entree.nextLine();
			System.out.println("  ");
			double newSalaire= Personnel.calculs(Id2);
			System.out.println("------***------***------***------***-----");
			
			System.out.print("Combien avez-vous vendue ce derniers mois ?");
			int vente = entree.nextInt(); entree.nextLine();
			System.out.println("------***------***------***------***-----");
			
			double totalS=newSalaire + cm.interet(vente, newSalaire);
			System.out.println("Vous avez donc au final un salaire de " +totalS);
			System.out.println("Vous pouvez passer au retrait de votre salaire maintenant ,MERCI");
			System.out.println("------***------***------***------***-----");
		}
			
			
		
		
		
			
		
		
	}

	public static String getCommerciaux() {
		return Commerciaux;
	}
}
