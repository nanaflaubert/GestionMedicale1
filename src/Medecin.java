


/**
 * @author FLAUBERT
 *
 */
public class Medecin {
	
	private String pediatrie;
	private String optamologie;
	private String dentiste;
	private String cardiologie;
	
	/**
	 * Methode qui permet juste
	 * d'afficher un message de bienvenue
	 */
	public void pageAccueil(){ 
		
		System.out.println ("Bienvenue dans votre application d'Assistance Medicale en ligne ");
		System.out.println ("Merci de saisir les des données du patient");
		
	}
	
	
	public String genererTelephone(Patient patient){
				
		if(patient.getNom().length()<3){
			patient.getTelephone();			
		}else{
		patient.getTelephone ();
		}
		return patient.Telephone();
		
	}


	public String getCardiologie() {
		return cardiologie;
	}


	public void setCardiologie(String cardiologie) {
		this.cardiologie = cardiologie;
	}


	public String getDentiste() {
		return dentiste;
	}


	public void setDentiste(String dentiste) {
		this.dentiste = dentiste;
	}


	public String getOptamologie() {
		return optamologie;
	}


	public void setOptamologie(String optamologie) {
		this.optamologie = optamologie;
	}


	public String getPediatrie() {
		return pediatrie;
	}


	public void setPediatrie(String pediatrie) {
		this.pediatrie = pediatrie;
	}
}
	
	
	
	

	
