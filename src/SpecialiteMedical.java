
public class SpecialiteMedical {
	private int numService;
	private String nomService;
	private String[] motif;
	private int[] numMotif;
	
	
	
	public SpecialiteMedical() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public SpecialiteMedical (int numService, String nomService, String[] motif, int[] numMotif) {
		super();
		this.numService = numService;
		this.nomService = nomService;
		this.motif = motif;
		this.numMotif = numMotif;
	}



	//Acesseurs
	public int getNumService() {
		return numService;
	}
	public void setNumService(int numService) {
		this.numService = numService;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public String[] getmotif() {
		return motif;
	}
	public void setmotif(String[] motif) {
		this.motif = motif;
	}
	public int[] getnumMotif() {
		return numMotif;
	}
	public void setnumMotif(int[] numMotif) {
		this.numMotif = numMotif;
	}
	
}
