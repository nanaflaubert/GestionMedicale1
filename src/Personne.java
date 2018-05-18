

/**
 * @author FLAUBERT
 *
 */
public class Personne {
	
	protected static String localisation; // propriete localisation
	protected static String age; // propriete age
	protected static String prenom;// propriete prenom
	protected static String nom;// propriete nom

	public static void main (String arg[]) {
		System.out.println ("Bienvenue dans mon application d'assistance medicale en ligne");

   }

	public static  String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		Personne.prenom = prenom;
	}

	public static String getAge() {
		return age;
	}

	public static void setAge(String age) {
		Personne.age = age;
	}

	public static String getLocalisation() {
		return localisation;
	}

	public static void setLocalisation(String localisation) {
		Personne.localisation = localisation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Personne.nom = nom;
	}

	public void setTelephone() {
		// TODO Auto-generated method stub
		
	}

	public void setAdresse(String next) {
		// TODO Auto-generated method stub
		
	}
}
