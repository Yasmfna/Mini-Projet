package atelier_plus;

import atelier_plus.Player;

public class Partie {
	private Player x;
	private Player y;
	private static final int MAX=21;
	public Partie(Player  x, Player y) {
		this.x=x;
		this.y=y;
	}
	
	/*
	 * Jouer la partie de 21 avec les étapes intermédiaires
	 */
	
	public void jouer() {
	
		int total_1=0;
		int total_2=0;
		System.out.println(x.nom() +" commence");
		System.out.println("-----**-----**-----**-----**-----");
		while (total_1<MAX || total_2<MAX) {
			x.Jouer();
			System.out.println(x +" a jouer "+x.resultat());
			total_1 += x.resultat();
			System.out.println("Le total jouer est de " + total_1);
			System.out.println("-----**-----**-----**-----**-----");
			//echanger();
			
			y.Jouer();
			System.out.println(y +" a jouer "+y.resultat());
			total_2 += y.resultat();
			System.out.println("Le total jouer est de " + total_2);
			System.out.println("-----**-----**-----**-----**-----");
			//echanger();
			
			if(total_1>=21) {
				System.out.println(x + " est le gagnant");
				break;
			}else {
				if(total_2>=21) {
					System.out.println(y + " est le gagnant");
					break;
				}
			}
		}
		
	}
	
	/*
	 * private void echanger() {
	 
		Player temp =x;
		x=y;
		y=temp;
	}*/


}
