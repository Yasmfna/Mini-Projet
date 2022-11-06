package MiniProjet;
import java.util.*;

// Cette class MAIN contient les résolutions des différentes questions du projet
//Vous pouvez testez aussi la classe MAIN
// Pour tester avec le mécanisme, veuillez vous dirigez vers la class QUESTION !!!

public class Main {
	static String[] Tab ;
		
	public static void main(String[] main) {
		
		//Question 01
		Scanner entree = new Scanner(System.in);
		System.out.println("Bienvenue dans l'entreprise YASM SARL ! Veuillez vous enregistrez s'il vous plait !!");
		System.out.print("Votre nom:");
		String nom = entree.nextLine();
		System.out.println("  ");
		
		System.out.println("Veuillez entrez votre indice avec ',' pour les nombres decimaux. Merci!");
		System.out.print("Votre indice:");
		double Id = entree.nextDouble(); entree.nextLine();
		System.out.println("  ");
		
		System.out.print("Votre matricule:");
		String matricule = entree.nextLine();
		System.out.println("  ");
		
		Personnel employer= new Personnel(nom,Id,matricule);
		
		System.out.println("L'employer "+nom+" d'indice "+Id+" et de matricule "+matricule);
		employer.calculs(Id);
		System.out.println("  ");
		
		System.out.println("------***------***------***------***-----");
		
		
		//Question 02
		Cadres_Dirigeants cad = new Cadres_Dirigeants(nom,Id,matricule); 
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
		
		
		//Question 03
		System.out.println("Etes-vous un cadre ?");
		System.out.println("Bienvenu "+nom);
		
		System.out.print("pourrais-je avoir votre INDICE :");
		double Id2 = entree.nextDouble(); entree.nextLine();
		System.out.println("  ");
		double nextSalaire= Personnel.calculs(Id2);
		
		Commerciaux cm = new Commerciaux(nom,Id2,matricule,nextSalaire);
		
		System.out.println("Combien avez-vous vendue ce derniers mois ?");
		int vente = entree.nextInt(); entree.nextLine();
		
		cm.interet(vente,nextSalaire);
		System.out.println("Vous avez donc au final un salaire de " +cm.interet(vente,nextSalaire));
		
		
     
	}
}
