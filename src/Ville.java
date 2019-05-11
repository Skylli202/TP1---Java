/**
 * 
 */

/**
 * @author Skylli
 *
 */

public class Ville {
	// 1)
	private String mNom;
	private double mSuperficie;
	private int mPopulation;
	
	Ville(){
		this.mNom = "inconnu";
		this.mSuperficie = 0;
		this.mPopulation = 0;
	}
	
	Ville(String nom, double superficie, int population){
		this.mNom = nom;
		this.mSuperficie = superficie;
		this.mPopulation = population;
	}
	
	// 2)
	public String getNom() {
		return mNom;
	}

	public void setNom(String mNom) {
		this.mNom = mNom;
	}

	public double getSuperficie() {
		return mSuperficie;
	}

	public void setSuperficie(double mSuperficie) {
		this.mSuperficie = mSuperficie;
	}

	public int getPopulation() {
		return mPopulation;
	}

	public void setPopulation(int mPopulation) {
		this.mPopulation = mPopulation;
	}
	
	// 3)
	public String toString() {
		return this.getNom() + ", " + this.getSuperficie() + " kilomètres carrés, pour "
				+ this.getSuperficie() + " habitants";
	}
	
	// Ex4
	boolean estIdentiqueA(Ville ville) {
		if(this.mNom != ville.mNom)
			return false;
		
		if(this.mSuperficie != ville.mSuperficie)
			return false;
		
		if(this.mPopulation != ville.mPopulation)
			return false;
		
		return true;
	}
	
	/*
	 * Cette method doit être static car elle sera appelé sans instance de Ville devant.
	 * Il faudra donc précisé Obj.method() et non Dijon.method()...
	 * */
	static boolean sontIdentiques(Ville ville1, Ville ville2) {
		if(ville1.mNom != ville2.mNom)
			return false;
		
		if(ville1.mSuperficie != ville2.mSuperficie)
			return false;
		
		if(ville1.mPopulation != ville2.mPopulation)
			return false;
		
		return true;
	}
}
