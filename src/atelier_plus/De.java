package atelier_plus;

public class De {
		//private final int nb_de_faces;
		private static int face_visibles;
		
		/* 
		 * *Fabriquer un De a "nb_de_faces" faces
		 */
		
		/*public De(int nb_de_faces) {
			this.nb_de_faces = nb_de_faces;
			lancer();
		}
		
		//Fabriquer le dé our fixer le nombre de face
		public De() {
			this(6);
		}*/
		
		//lancer le De
		public static int lancer() {
			face_visibles = (int)Math.round(Math.random()*1000)% 6 +1;
			return face_visibles;
		}
		
		//Retourner la valeur de la face visible
		public static int faceVisible() {
			return face_visibles;
		}
		
		//Retourner une représentation du De
		public String toString() {
			return "<" + face_visibles +">";
		}
		
		
		
		
		

	}



