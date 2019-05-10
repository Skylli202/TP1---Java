/**
 * 
 */

/**
 * @author Skylli
 *
 */
public class Departement {
	private String mNom;
	private int mNumero;
	private int mNbVilles;
	private int mNbVillesSaisies;
	private Ville mTabVille[];
	
	public Departement(String mNom, int mNumero) {
		this.mNom = mNom;
		this.mNumero = mNumero;
		this.mNbVilles = 0;
		this.mTabVille = new Ville[this.mNbVilles];
	}
	
	public void ajouterVille(Ville ville) {
		if(this.mNbVillesSaisies < this.mNbVilles) {
			this.mTabVille[this.mNbVillesSaisies] = ville;
			this.mNbVillesSaisies ++;
		} else {
			System.out.println("Error : cannot add "+ville+" into Departement, Departement is full");
		}
	}
}
