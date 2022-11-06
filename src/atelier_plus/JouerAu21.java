package atelier_plus;
import java.util.*;

public class JouerAu21 {
	
		private static final String OUI ="oui";
		private static final String NON ="non";
	    
		
		private static boolean encoreUnePartie(Scanner entree) {
			String reponse = NON;
			
			do {
				System.out.println("Voulez vous contunier la partie ?");
				reponse = entree.nextLine().trim().toLowerCase();
			}while(!reponse.equals(OUI)&& !reponse.equals(NON));
			return reponse.equals(OUI);
		 }


		
		public static void main(String[] main) {
			Scanner entree = new Scanner(System.in);
			System.out.println("Bienvenue au jeu du 21");
			System.out.println("");
			System.out.println("Entrer vos noms pour le jeu: ");
			
			System.out.print("Joueur 1: ");
			String j1 =entree.nextLine();
			
			System.out.print("Joueur 2: ");
			String j2 =entree.nextLine();
			
			Player joueur1 = new Player(j1);
			Player joueur2 = new Player(j2);
			
			
			do {
				System.out.println();
				System.out.println("C'est parti");
				System.out.println();
				Partie UnePartie = new Partie(joueur1,joueur2);
				UnePartie.jouer();
			}while(encoreUnePartie(entree));
			
		}
	}





