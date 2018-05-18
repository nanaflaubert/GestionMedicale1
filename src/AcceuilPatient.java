import java.util.Scanner;


/**
 * @author FLAUBERT
 *
 */
public class AcceuilPatient {
	
	

private String pediatrie;
	private String optamologie;
	private String dentiste;
	private static String cardiologie;
	
	
	public static void main (String []args) {
		
		System.out.println("Bienvenue dans votre application d'Assistance Medicale en ligne");
		  
		
	 String pediatrie;
	 String optamologie;
	 String dentiste;
	 String cardiologie;
	 
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		//Tant que la réponse donnée est égale à oui…
		while (reponse == 'O')
		{
		  //On affiche une instruction
		  System.out.println("Entrez une specialite");
		  //On récupère la pediatrie saisi
		  pediatrie = sc.nextLine();
		  //On affiche pediatrie
		  System.out.println( "Bienvenue au service " + pediatrie);
		  //On demande si la personne veut faire un autre essai
		  System.out.println("Voulez-vous continuer ? (O/N)");
		  
		  //On récupère la réponse de l'utilisateur
		  reponse = sc.nextLine().charAt(0);
		
		  
		  System.out.println("Au revoir…");
		  
		  System.out.println("voulez-vous vous enregistrez (O/N)");
		String nom;
		String prenom;
		String age;
		String telephone;
		String localisation;
		
		  char reponse1 = 'O';
			Personne personne = new Personne ();
			//Tant que la réponse donnée est égale à oui…
			while (reponse == 'O')
			{
			  //On affiche une instruction
			  System.out.println("Entrez votre nom : ");
			  //On recupere le nom saisi
			 nom = sc.nextLine();
			 // On affiche le prenom saisi
			  System.out.println("Entrez votre prenon");
			  //On recupere le prenom saisi
			  prenom = sc.nextLine();
			  //On recupere le prenom
			  System.out.println("Entrez votre age : ");
			  //On recupere l'age saisi
			  age = sc.nextLine();
			  //On affiche une instruction
			  System.out.println("Entrez votre telephone : ");
			//On saisi le telephone
			telephone = sc.nextLine();
			//On affiche une instruction
			  System.out.println("Entrez votre localisation : ");
			//On saisi la localisation
				localisation = sc.nextLine();
				
			  //On demande si la personne veut faire un autre essai
			  System.out.println("Voulez-vous reessayer ? (O/N)");
			  //On récupère la réponse de l'utilisateur
			  reponse = sc.nextLine().charAt(0);
			}
		
			System.out.println("Au revoir…");
			
		}
		
	}
	
	

	public String getPediatrie() {
		return pediatrie;
	}

	public void setPediatrie(String pediatrie) {
		this.pediatrie = pediatrie;
	}

	public String getOptamologie() {
		return optamologie;
	}

	public void setOptamologie(String optamologie) {
		this.optamologie = optamologie;
	}

	public String getDentiste() {
		return dentiste;
	}

	public void setDentiste(String dentiste) {
		this.dentiste = dentiste;
	}

	public String getCardiologie() {
		return cardiologie;
	}

	public void setCardiologie(String cardiologie) {
		this.cardiologie = cardiologie;
	}
	}
	