/**
 * 
 */

/**
 * @author Skylli
 *
 */
// 1)
public class Departement {
	private String mNom;
	private int mNumero;
	private int mNbVilles;
	private int mNbVillesSaisies;
	private Ville mTabVille[];
	
	public Departement(String nom, int numero, int nbVilles) {
		this.mNom = nom;
		this.mNumero = numero;
		this.mNbVilles = nbVilles;
		this.mNbVillesSaisies = 0;
		this.mTabVille = new Ville[this.mNbVilles];
	}
	
	// 2)
	public void ajouterVille(Ville ville) {
		if(this.mNbVillesSaisies < this.mNbVilles) {
			this.mTabVille[this.mNbVillesSaisies] = ville;
			this.mNbVillesSaisies ++;
			System.out.println("Succesfully added " + ville.getNom() + " to " + this.mNom);
		} else {
			System.out.println("Error : cannot add "+ville+" into Departement, Departement is full");
		}
	}
	
	// 3)
	public String toString() {
		String str = "Villes du département " + this.mNom + "("+ this.mNumero +") : \n";
		
		for(int i=0; i<this.mNbVillesSaisies; i++) {
			str += this.mTabVille[i].toString() + "\n";
		}
		
		return str;
	}
}
