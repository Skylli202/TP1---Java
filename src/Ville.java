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
}
