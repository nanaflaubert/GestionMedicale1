
/**
 * @author FLAUBERT
 *
 */
public class Patient{
	
	
	private static final int getNom = 0;
	//Variables
	private String prenom;
	private String nom;
	private int age;
	private int telephone;
	private String email;
	
	//Constructeurs
	/**
	 * Le constructeur sans paramètre de Personne
	 */
	public Patient(){
		super();
	}
	
	public Patient(String prenom, String nom, int age,
			int telephone, String email) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.telephone = telephone;
		this.email = email;
	}
	

	
	public Patient(String prenom, String nom, int age, int telephone) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.telephone = telephone;
		
	}

	//Accesseurs
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int patient) {
		this.telephone = patient;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

	public int getPriseEnCharge() {
		// TODO Auto-generated method stub
		return 0;
	}


	void setMatricule(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	public void setTelephone(String string) {
		// TODO Auto-generated method stub
		
	}

	
	void setTelephone1(String string) {
		// TODO Auto-generated method stub
		
	}

	public String Telephone() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getGetnom() {
		return getNom;
	}

	 void getTelephone1() {
		// TODO Auto-generated method stub
		
	}

}
